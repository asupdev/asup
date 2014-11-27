package org.asup.git;

import java.io.File;

public class PathJoin {

  private String joinedPath;

  public PathJoin(String root, String path) {
    if (StringUtils.isEmpty(root)) {
      joinedPath = path;
    } else if (root.endsWith("/")) {
      joinedPath = root + withoutLeadingSlash(path);
    } else {
      joinedPath = root + withLeadingSlash(path);     
    }
  }

  private String withLeadingSlash(String path) {
    if (path == null) {
      return "";
    }
    
    if (path.startsWith("/")) {
      return path;
    }
    
    return "/" + path;
  }

  private String withoutLeadingSlash(String path) {
    if (path == null) {
      return "";
    }
    
    if (path.startsWith("/")) {
      return StringUtils.mid(path, 2);
    }
    
    return path;
  }

  public String toString() {
    return joinedPath;
  }
  
  public File asFile() {
    return new File(toString());
  }
}
