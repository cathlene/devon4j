package com.devonfw.application.jtqj.centermanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.centermanagement.logic.api.Centermanagement;
import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterEto;
import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterSearchCriteriaTo;
import com.devonfw.application.jtqj.centermanagement.service.api.rest.CentermanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Centermanagement}.
 */
@Named("CentermanagementRestService")
public class CentermanagementRestServiceImpl implements CentermanagementRestService {

  @Inject
  private Centermanagement centermanagement;

  @Override
  public CenterEto getCenter(long id) {

    return this.centermanagement.findCenter(id);
  }

  @Override
  public CenterEto saveCenter(CenterEto center) {

    return this.centermanagement.saveCenter(center);
  }

  @Override
  public void deleteCenter(long id) {

    this.centermanagement.deleteCenter(id);
  }

  @Override
  public Page<CenterEto> findCenters(CenterSearchCriteriaTo searchCriteriaTo) {

    return this.centermanagement.findCenters(searchCriteriaTo);
  }
}