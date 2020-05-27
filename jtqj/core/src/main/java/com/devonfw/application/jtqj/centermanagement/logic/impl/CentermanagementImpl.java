package com.devonfw.application.jtqj.centermanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.centermanagement.logic.api.Centermanagement;
import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterEto;
import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterSearchCriteriaTo;
import com.devonfw.application.jtqj.centermanagement.logic.api.usecase.UcFindCenter;
import com.devonfw.application.jtqj.centermanagement.logic.api.usecase.UcManageCenter;
import com.devonfw.application.jtqj.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of centermanagement
 */
@Named
public class CentermanagementImpl extends AbstractComponentFacade implements Centermanagement {

  @Inject
  private UcFindCenter ucFindCenter;

  @Inject
  private UcManageCenter ucManageCenter;

  @Override
  public CenterEto findCenter(long id) {

    return this.ucFindCenter.findCenter(id);
  }

  @Override
  public Page<CenterEto> findCenters(CenterSearchCriteriaTo criteria) {

    return this.ucFindCenter.findCenters(criteria);
  }

  @Override
  public CenterEto saveCenter(CenterEto center) {

    return this.ucManageCenter.saveCenter(center);
  }

  @Override
  public boolean deleteCenter(long id) {

    return this.ucManageCenter.deleteCenter(id);
  }
}
