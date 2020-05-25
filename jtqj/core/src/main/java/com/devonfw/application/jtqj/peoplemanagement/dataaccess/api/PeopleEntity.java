package com.devonfw.application.jtqj.peoplemanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.devonfw.application.jtqj.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.jtqj.peoplemanagement.common.api.People;

/**
 * @author cvanmoor
 */
@Entity
@Table(name = "PEOPLE")
public class PeopleEntity extends ApplicationPersistenceEntity implements People {

  private String people_name;

  private static final long serialVersionUID = 1L;

  /**
   * @return people_name
   */
  @Override
  public String getPeople_name() {

    return this.people_name;
  }

  /**
   * @param people_name new value of {@link #getpeople_name}.
   */
  @Override
  public void setPeople_name(String people_name) {

    this.people_name = people_name;
  }

}
