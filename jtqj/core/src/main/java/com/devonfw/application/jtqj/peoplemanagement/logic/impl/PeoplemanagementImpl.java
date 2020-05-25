package com.devonfw.application.jtqj.peoplemanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.general.logic.base.AbstractComponentFacade;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.Peoplemanagement;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleEto;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleSearchCriteriaTo;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.usecase.UcFindPeople;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.usecase.UcManagePeople;

/**
 * Implementation of component interface of peoplemanagement
 */
@Named
public class PeoplemanagementImpl extends AbstractComponentFacade implements Peoplemanagement {

  @Inject
  private UcFindPeople ucFindPeople;

  @Inject
  private UcManagePeople ucManagePeople;

  @Override
  public PeopleEto findPeople(long id) {

    return this.ucFindPeople.findPeople(id);
  }

  @Override
  public Page<PeopleEto> findPeoples(PeopleSearchCriteriaTo criteria) {

    return this.ucFindPeople.findPeoples(criteria);
  }

  @Override
  public PeopleEto savePeople(PeopleEto people) {

    return this.ucManagePeople.savePeople(people);
  }

  @Override
  public boolean deletePeople(long id) {

    return this.ucManagePeople.deletePeople(id);
  }
}
