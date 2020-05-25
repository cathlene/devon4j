package com.devonfw.application.jtqj.peoplemanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.jtqj.peoplemanagement.dataaccess.api.PeopleEntity;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleEto;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.usecase.UcManagePeople;
import com.devonfw.application.jtqj.peoplemanagement.logic.base.usecase.AbstractPeopleUc;

/**
 * Use case implementation for modifying and deleting Peoples
 */
@Named
@Validated
@Transactional
public class UcManagePeopleImpl extends AbstractPeopleUc implements UcManagePeople {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManagePeopleImpl.class);

  @Override
  public boolean deletePeople(long peopleId) {

    PeopleEntity people = getPeopleRepository().find(peopleId);
    getPeopleRepository().delete(people);
    LOG.debug("The people with id '{}' has been deleted.", peopleId);
    return true;
  }

  @Override
  public PeopleEto savePeople(PeopleEto people) {

    Objects.requireNonNull(people, "people");

    PeopleEntity peopleEntity = getBeanMapper().map(people, PeopleEntity.class);

    // initialize, validate peopleEntity here if necessary
    PeopleEntity resultEntity = getPeopleRepository().save(peopleEntity);
    LOG.debug("People with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, PeopleEto.class);
  }
}
