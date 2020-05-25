package com.devonfw.application.jtqj.peoplemanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleEto;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleSearchCriteriaTo;

public interface UcFindPeople {

  /**
   * Returns a People by its id 'id'.
   *
   * @param id The id 'id' of the People.
   * @return The {@link PeopleEto} with id 'id'
   */
  PeopleEto findPeople(long id);

  /**
   * Returns a paginated list of Peoples matching the search criteria.
   *
   * @param criteria the {@link PeopleSearchCriteriaTo}.
   * @return the {@link List} of matching {@link PeopleEto}s.
   */
  Page<PeopleEto> findPeoples(PeopleSearchCriteriaTo criteria);

}
