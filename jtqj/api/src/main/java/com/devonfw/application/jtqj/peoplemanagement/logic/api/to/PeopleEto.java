package com.devonfw.application.jtqj.peoplemanagement.logic.api.to;

import com.devonfw.application.jtqj.peoplemanagement.common.api.People;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of People
 */
public class PeopleEto extends AbstractEto implements People {

  private static final long serialVersionUID = 1L;

  private String people_name;

  @Override
  public String getPeople_name() {

    return people_name;
  }

  @Override
  public void setPeople_name(String people_name) {

    this.people_name = people_name;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.people_name == null) ? 0 : this.people_name.hashCode());
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
    PeopleEto other = (PeopleEto) obj;
    if (this.people_name == null) {
      if (other.people_name != null) {
        return false;
      }
    } else if (!this.people_name.equals(other.people_name)) {
      return false;
    }
    return true;
  }
}
