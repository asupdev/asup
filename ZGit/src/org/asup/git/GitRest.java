package org.asup.git;

import java.awt.image.BufferedImage;
import java.util.*;
import java.util.logging.Level;

import javax.imageio.ImageIO;

import org.json.*;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.MediaType;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

public class GitRest {

  private interface Operation {
    public Representation execute(ClientResource clientResource, Representation rep);
  }
  
  private final static Operation PUT = new Operation() {
    public Representation execute(ClientResource clientResource,
                                  Representation rep) {
      return clientResource.put(rep);
    }
  };
  
  private final static Operation POST = new Operation() {
    public Representation execute(ClientResource clientResource,
                                  Representation rep) {
      return clientResource.post(rep);
    }
  };
  
  private final String gitServer;
  private final String userName;
  private String password;

  public GitRest(String gitServer, String userName, String password) {
    this.gitServer = gitServer;
    this.userName = userName;
	this.password = password;
    gestisciLogging();
  }
  

  private void gestisciLogging() {
    ClientResource clientResource = new ClientResource("");
    clientResource.getLogger().setLevel(Level.OFF);    
  }

  protected String gitServer() {
    return this.gitServer;
  }
  
  protected String gitRestUrl() {
//	  return "https://api.github.com/repos/asupdev/asup/issues";
    return new PathJoin(gitServer(), "/repos/asupdev/asup").toString();
  }

  protected ClientResource getClientResource(String uri) {
    ClientResource clientResource = new ClientResource(uri);
    clientResource.setChallengeResponse(ChallengeScheme.HTTP_BASIC, 
                                        userName,
                                        password);
    return clientResource;
  }
  
  
  public JSONObject getObject(String apiPath) throws Exception {
	  return new JSONObject(getContent(apiPath));
  }

  public String getContent(String apiPath) throws Exception {
    String uri = new PathJoin(gitRestUrl(), apiPath).toString();
    Representation response = null;
    try {
      response = getClientResource(uri).get(MediaType.APPLICATION_JSON);
      return response.getText();
    } finally {
      if(response != null) {
        response.exhaust();
        response.release();
      }
    }
  }
  
  
  public BufferedImage getImage(String apiPath) throws Exception {
    String uri = gitRestUrl() + apiPath;
    Representation response = null;
    BufferedImage result = null;
    try {
      response = getClientResource(uri).get(MediaType.IMAGE_PNG);
      result = ImageIO.read(response.getStream());
    } finally {
      if(response != null) {
        response.exhaust();
        response.release();
      }
    }
    return result;
  }

  
  public JSONArray getArray(String apiPath) throws Exception{
	  return new JSONArray(getContent(apiPath));
  }
  
  public JSONArray getArray(String apiPath, String arrayKey) throws Exception{
    return getObject(apiPath).getJSONArray(arrayKey);
  }
  
  public JSONObject post(String apiPath, 
                         Coppia<String, Object>... parms) throws Exception {
    return execute(POST, apiPath, parms);
  }
  
  public JSONObject put(String apiPath, 
                        Coppia<String, Object>... parms) throws Exception {
    return execute(PUT, apiPath, parms);
  }
  

  private JSONObject execute(Operation operation, 
                             String apiPath,
                             Coppia<String, Object>[] parms) throws Exception {
    JSONStringer jsRequest = new JSONStringer();
    jsRequest.object();
    for (int i = 0; i < parms.length; i++) {
      jsRequest.key(parms[i].x()).value(parms[i].y());
    }
    jsRequest.endObject();
    Representation rep = new JsonRepresentation(jsRequest);
    rep.setMediaType(MediaType.APPLICATION_JSON);
    Representation representation = null;
    JSONObject result = null;
    try {
      representation = operation.execute(getClientResource(gitRestUrl() + apiPath), rep);
      result = new JSONObject(representation.getText());
    } finally {
      if(representation != null) {
        representation.exhaust();
        representation.release();
      }
    }
    return result;
  }

  public static Coppia<String, Object> parm(String key, Object value) {
    return new Coppia<String, Object>(key, value);
  }

  public void put(String apiPath, Map<String, Object> variables) throws Exception {
    put(apiPath, toCouple(variables));    
  }

  private Coppia<String, Object>[] toCouple(Map<String, Object> variables) {
    Coppia<String, Object>[] result = new Coppia[variables.size()];
    int i = 0;
    for (Map.Entry<String, Object> variable : variables.entrySet()) {
      result[i++] = new Coppia<String, Object>(variable.getKey(), variable.getValue());
    }
    return result;
  }

  public void delete(String apiPath) {
    String uri = gitRestUrl() + apiPath;
    getClientResource(uri).delete();
  }

}
