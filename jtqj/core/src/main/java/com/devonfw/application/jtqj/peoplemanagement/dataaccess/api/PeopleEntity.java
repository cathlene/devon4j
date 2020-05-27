package com.devonfw.application.jtqj.peoplemanagement.dataaccess.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.devonfw.application.jtqj.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.jtqj.peoplemanagement.common.api.People;

/**
 * @author cvanmoor
 */
@Entity
@Table(name = "PEOPLE")
public class PeopleEntity extends ApplicationPersistenceEntity implements People {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_people")
  private Long id;

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

  @Override
  public Long getId() {

    // TODO Auto-generated method stub
    return this.id;
  }

  @Override
  public void setId(Long id) {

    this.id = id;

  }

}
