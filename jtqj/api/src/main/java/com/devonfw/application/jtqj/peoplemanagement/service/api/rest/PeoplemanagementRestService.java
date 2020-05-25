package com.devonfw.application.jtqj.peoplemanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.peoplemanagement.logic.api.Peoplemanagement;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleEto;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Peoplemanagement}.
 */
@Path("/peoplemanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface PeoplemanagementRestService {

  /**
   * Delegates to {@link Peoplemanagement#findPeople}.
   *
   * @param id the ID of the {@link PeopleEto}
   * @return the {@link PeopleEto}
   */
  @GET
  @Path("/people/{id}/")
  public PeopleEto getPeople(@PathParam("id") long id);

  /**
   * Delegates to {@link Peoplemanagement#savePeople}.
   *
   * @param people the {@link PeopleEto} to be saved
   * @return the recently created {@link PeopleEto}
   */
  @POST
  @Path("/people/")
  public PeopleEto savePeople(PeopleEto people);

  /**
   * Delegates to {@link Peoplemanagement#deletePeople}.
   *
   * @param id ID of the {@link PeopleEto} to be deleted
   */
  @DELETE
  @Path("/people/{id}/")
  public void deletePeople(@PathParam("id") long id);

  /**
   * Delegates to {@link Peoplemanagement#findPeopleEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding peoples.
   * @return the {@link Page list} of matching {@link PeopleEto}s.
   */
  @Path("/people/search")
  @POST
  public Page<PeopleEto> findPeoples(PeopleSearchCriteriaTo searchCriteriaTo);

}