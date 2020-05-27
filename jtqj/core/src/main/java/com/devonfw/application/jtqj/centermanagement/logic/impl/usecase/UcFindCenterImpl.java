package com.devonfw.application.jtqj.centermanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.jtqj.centermanagement.dataaccess.api.CenterEntity;
import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterEto;
import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterSearchCriteriaTo;
import com.devonfw.application.jtqj.centermanagement.logic.api.usecase.UcFindCenter;
import com.devonfw.application.jtqj.centermanagement.logic.base.usecase.AbstractCenterUc;

/**
 * Use case implementation for searching, filtering and getting Centers
 */
@Named
@Validated
@Transactional
public class UcFindCenterImpl extends AbstractCenterUc implements UcFindCenter {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindCenterImpl.class);

  @Override
  public CenterEto findCenter(long id) {

    LOG.debug("Get Center with id {} from database.", id);
    Optional<CenterEntity> foundEntity = getCenterRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), CenterEto.class);
    else
      return null;
  }

  @Override
  public Page<CenterEto> findCenters(CenterSearchCriteriaTo criteria) {

    Page<CenterEntity> centers = getCenterRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(centers, CenterEto.class);
  }

}
