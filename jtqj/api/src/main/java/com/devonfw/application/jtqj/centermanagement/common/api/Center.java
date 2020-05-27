package com.devonfw.application.jtqj.centermanagement.common.api;

import com.devonfw.application.jtqj.general.common.api.ApplicationEntity;

public interface Center extends ApplicationEntity {

  /**
   * @return center_nameId
   */

  public String getCenter_name();

  /**
   * @param center_name setter for center_name attribute
   */

  public void setCenter_name(String center_name);

}
