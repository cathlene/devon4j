package com.devonfw.application.jtqj.peoplemanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.jtqj.general.logic.base.AbstractUc;
import com.devonfw.application.jtqj.peoplemanagement.dataaccess.api.repo.PeopleRepository;

/**
 * Abstract use case for Peoples, which provides access to the commonly necessary data access objects.
 */
public class AbstractPeopleUc extends AbstractUc {

  /** @see #getPeopleRepository() */
  @Inject
  private PeopleRepository peopleRepository;

  /**
   * Returns the field 'peopleRepository'.
   * 
   * @return the {@link PeopleRepository} instance.
   */
  public PeopleRepository getPeopleRepository() {

    return this.peopleRepository;
  }

}
