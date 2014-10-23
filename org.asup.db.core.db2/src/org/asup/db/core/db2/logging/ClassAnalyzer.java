package org.asup.db.core.db2.logging;

import java.lang.reflect.*;
import java.util.*;

public class ClassAnalyzer<T> {

  private Class<T> classeBase;

  public ClassAnalyzer(Class<T> classeBase) {
    this.classeBase = classeBase;
  }

  public Collection<T> elencoCostanti() {
    return elencoCostanti(classeBase);
  }
  
  public <R> Collection<R> elencoCostanti(Class<R> tipo) {
    Field[] fields = classeBase.getDeclaredFields();
    Collection elencoRisultati = new ArrayList();
    for (int i = 0; i < fields.length; i++) {
      if (tipo == null || tipo.isAssignableFrom(fields[i].getType())) {
        try {
          elencoRisultati.add(fields[i].get(null));
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
      }
    }
    return elencoRisultati;
  }

  public T[] arrayCostanti(){
    Collection<T> collection = elencoCostanti();
    return collection.toArray((T[]) Array.newInstance(classeBase, collection.size()));
  }
      
  public Set elencoInterfacce() {
    return elencoInterfacce(classeBase);
  }

  private Set elencoInterfacce(Class clazz) {
	  if (clazz == null) {
		return new HashSet();
	}
    Set result = asSet(clazz.getInterfaces());
    
    if (!clazz.equals(Object.class)) {
      result.addAll(elencoInterfacce(clazz.getSuperclass()));
    }
    
    return result;
  }

  private Set asSet(Class[] interfaces) {
    Set result = new HashSet();
    for (int i = 0; i < interfaces.length; i++) {
      result.add(interfaces[i]);
    }
    return result;
  }

  public Class[] elencoInterfacceAsArray() {
    Set elenco = elencoInterfacce();
    return (Class[]) elenco.toArray(new Class[elenco.size()]);
  }

  public List<Class> elencoClassi() {
    return elencoClassi(classeBase);
  }
  
  private List elencoClassi(final Class clazz) {  
    List result = new ArrayList(){{
      add(clazz);
    }};
          
    if (!clazz.equals(Object.class)) {
      result.addAll(elencoClassi(clazz.getSuperclass()));
    }
    
    return result;
  }

  public Object invokeStatic(String methodName, 
                             Class[] parameterTypes, 
                             Object[] args) {
    try {
      return this.classeBase.getMethod(methodName, parameterTypes)
             .invoke(null, args);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public List<Class> elencoClassiEInterfacce() {
    List<Class> result = elencoClassi();
    result.addAll(elencoInterfacce());
    return result;
  }

}
