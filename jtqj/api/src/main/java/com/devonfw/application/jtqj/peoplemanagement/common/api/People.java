package com.devonfw.application.jtqj.peoplemanagement.common.api;

import com.devonfw.application.jtqj.general.common.api.ApplicationEntity;

public interface People extends ApplicationEntity {

  /**
   * @return people_nameId
   */

  public String getPeople_name();

  /**
   * @param people_name setter for people_name attribute
   */

  public void setPeople_name(String people_name);

}
