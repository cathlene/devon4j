package com.devonfw.application.jtqj.peoplemanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.peoplemanagement.logic.api.Peoplemanagement;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleEto;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleSearchCriteriaTo;
import com.devonfw.application.jtqj.peoplemanagement.service.api.rest.PeoplemanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Peoplemanagement}.
 */
@Named("PeoplemanagementRestService")
public class PeoplemanagementRestServiceImpl implements PeoplemanagementRestService {

  @Inject
  private Peoplemanagement peoplemanagement;

  @Override
  public PeopleEto getPeople(long id) {

    return this.peoplemanagement.findPeople(id);
  }

  @Override
  public PeopleEto savePeople(PeopleEto people) {

    return this.peoplemanagement.savePeople(people);
  }

  @Override
  public void deletePeople(long id) {

    this.peoplemanagement.deletePeople(id);
  }

  @Override
  public Page<PeopleEto> findPeoples(PeopleSearchCriteriaTo searchCriteriaTo) {

    return this.peoplemanagement.findPeoples(searchCriteriaTo);
  }
}