package com.devonfw.application.jtqj.centermanagement.logic.api.to;

import com.devonfw.application.jtqj.centermanagement.common.api.Center;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Center
 */
public class CenterEto extends AbstractEto implements Center {

  private static final long serialVersionUID = 1L;

  private String center_name;

  @Override
  public String getCenter_name() {

    return center_name;
  }

  @Override
  public void setCenter_name(String center_name) {

    this.center_name = center_name;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.center_name == null) ? 0 : this.center_name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    CenterEto other = (CenterEto) obj;
    if (this.center_name == null) {
      if (other.center_name != null) {
        return false;
      }
    } else if (!this.center_name.equals(other.center_name)) {
      return false;
    }
    return true;
  }
}
