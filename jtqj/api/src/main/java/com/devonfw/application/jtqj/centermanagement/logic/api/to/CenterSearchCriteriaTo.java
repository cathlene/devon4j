package com.devonfw.application.jtqj.centermanagement.logic.api.to;

import com.devonfw.application.jtqj.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.jtqj.centermanagement.common.api.Center}s.
 */
public class CenterSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String center_name;

  private StringSearchConfigTo center_nameOption;

  /**
   * @return center_nameId
   */

  public String getCenter_name() {

    return center_name;
  }

  /**
   * @param center_name setter for center_name attribute
   */

  public void setCenter_name(String center_name) {

    this.center_name = center_name;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getCenter_name() center_name}.
   */
  public StringSearchConfigTo getCenter_nameOption() {

    return this.center_nameOption;
  }

  /**
   * @param center_nameOption new value of {@link #getCenter_nameOption()}.
   */
  public void setCenter_nameOption(StringSearchConfigTo center_nameOption) {

    this.center_nameOption = center_nameOption;
  }

}
