package com.devonfw.application.jtqj.centermanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.jtqj.centermanagement.dataaccess.api.repo.CenterRepository;
import com.devonfw.application.jtqj.general.logic.base.AbstractUc;

/**
 * Abstract use case for Centers, which provides access to the commonly necessary data access objects.
 */
public class AbstractCenterUc extends AbstractUc {

  /** @see #getCenterRepository() */
  @Inject
  private CenterRepository centerRepository;

  /**
   * Returns the field 'centerRepository'.
   * 
   * @return the {@link CenterRepository} instance.
   */
  public CenterRepository getCenterRepository() {

    return this.centerRepository;
  }

}
