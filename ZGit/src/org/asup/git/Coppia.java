package org.asup.git;

import java.io.Serializable;

public class Coppia <X, Y> implements Serializable {
  
  private final X x; 
  private final Y y; 
  
  public Coppia(X x, Y y) { 
    this.x = x; 
    this.y = y; 
  } 
  
  public X x() {
    return x;
  }
  
  public Y y() {
    return y;
  }

  @Override
  public String toString() {
      return "(" + x + "," + y + ")";
  }

  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((x == null) ? 0 : x.hashCode());
    result = prime * result + ((y == null) ? 0 : y.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Coppia other = (Coppia) obj;
    if (x == null) {
      if (other.x != null)
        return false;
    } else if (!x.equals(other.x))
      return false;
    if (y == null) {
      if (other.y != null)
        return false;
    } else if (!y.equals(other.y))
      return false;
    return true;
  }
  
}
