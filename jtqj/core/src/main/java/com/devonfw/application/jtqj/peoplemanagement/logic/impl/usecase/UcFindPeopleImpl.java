package com.devonfw.application.jtqj.peoplemanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.jtqj.peoplemanagement.dataaccess.api.PeopleEntity;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleEto;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleSearchCriteriaTo;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.usecase.UcFindPeople;
import com.devonfw.application.jtqj.peoplemanagement.logic.base.usecase.AbstractPeopleUc;

/**
 * Use case implementation for searching, filtering and getting Peoples
 */
@Named
@Validated
@Transactional
public class UcFindPeopleImpl extends AbstractPeopleUc implements UcFindPeople {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindPeopleImpl.class);

  @Override
  public PeopleEto findPeople(long id) {

    LOG.debug("Get People with id {} from database.", id);
    Optional<PeopleEntity> foundEntity = getPeopleRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), PeopleEto.class);
    else
      return null;
  }

  @Override
  public Page<PeopleEto> findPeoples(PeopleSearchCriteriaTo criteria) {

    Page<PeopleEntity> peoples = getPeopleRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(peoples, PeopleEto.class);
  }

}
