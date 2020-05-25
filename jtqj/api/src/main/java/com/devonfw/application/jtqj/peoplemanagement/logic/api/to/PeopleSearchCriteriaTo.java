package com.devonfw.application.jtqj.peoplemanagement.logic.api.to;

import com.devonfw.application.jtqj.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.jtqj.peoplemanagement.common.api.People}s.
 */
public class PeopleSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String people_name;

  private StringSearchConfigTo people_nameOption;

  /**
   * @return people_nameId
   */

  public String getPeople_name() {

    return people_name;
  }

  /**
   * @param people_name setter for people_name attribute
   */

  public void setPeople_name(String people_name) {

    this.people_name = people_name;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getPeople_name() people_name}.
   */
  public StringSearchConfigTo getPeople_nameOption() {

    return this.people_nameOption;
  }

  /**
   * @param people_nameOption new value of {@link #getPeople_nameOption()}.
   */
  public void setPeople_nameOption(StringSearchConfigTo people_nameOption) {

    this.people_nameOption = people_nameOption;
  }

}
