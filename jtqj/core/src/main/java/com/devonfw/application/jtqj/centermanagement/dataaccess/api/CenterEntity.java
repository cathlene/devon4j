package com.devonfw.application.jtqj.centermanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author cvanmoor
 *
 */

@Entity
@Table(name = "CENTER")
public class CenterEntity {

  private String center_name;

  /**
   * @return center_name
   */
  public String getCenter_name() {

    return this.center_name;
  }

  /**
   * @param center_name new value of {@link #getcenter_name}.
   */
  public void setCenter_name(String center_name) {

    this.center_name = center_name;
  }

}
