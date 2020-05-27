package com.devonfw.application.jtqj.centermanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.centermanagement.logic.api.Centermanagement;
import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterEto;
import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Centermanagement}.
 */
@Path("/centermanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface CentermanagementRestService {

  /**
   * Delegates to {@link Centermanagement#findCenter}.
   *
   * @param id the ID of the {@link CenterEto}
   * @return the {@link CenterEto}
   */
  @GET
  @Path("/center/{id}/")
  public CenterEto getCenter(@PathParam("id") long id);

  /**
   * Delegates to {@link Centermanagement#saveCenter}.
   *
   * @param center the {@link CenterEto} to be saved
   * @return the recently created {@link CenterEto}
   */
  @POST
  @Path("/center/")
  public CenterEto saveCenter(CenterEto center);

  /**
   * Delegates to {@link Centermanagement#deleteCenter}.
   *
   * @param id ID of the {@link CenterEto} to be deleted
   */
  @DELETE
  @Path("/center/{id}/")
  public void deleteCenter(@PathParam("id") long id);

  /**
   * Delegates to {@link Centermanagement#findCenterEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding centers.
   * @return the {@link Page list} of matching {@link CenterEto}s.
   */
  @Path("/center/search")
  @POST
  public Page<CenterEto> findCenters(CenterSearchCriteriaTo searchCriteriaTo);

}