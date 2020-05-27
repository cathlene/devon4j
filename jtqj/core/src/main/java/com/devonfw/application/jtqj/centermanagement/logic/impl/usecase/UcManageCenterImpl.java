package com.devonfw.application.jtqj.centermanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.jtqj.centermanagement.dataaccess.api.CenterEntity;
import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterEto;
import com.devonfw.application.jtqj.centermanagement.logic.api.usecase.UcManageCenter;
import com.devonfw.application.jtqj.centermanagement.logic.base.usecase.AbstractCenterUc;

/**
 * Use case implementation for modifying and deleting Centers
 */
@Named
@Validated
@Transactional
public class UcManageCenterImpl extends AbstractCenterUc implements UcManageCenter {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageCenterImpl.class);

  @Override
  public boolean deleteCenter(long centerId) {

    CenterEntity center = getCenterRepository().find(centerId);
    getCenterRepository().delete(center);
    LOG.debug("The center with id '{}' has been deleted.", centerId);
    return true;
  }

  @Override
  public CenterEto saveCenter(CenterEto center) {

    Objects.requireNonNull(center, "center");

    CenterEntity centerEntity = getBeanMapper().map(center, CenterEntity.class);

    // initialize, validate centerEntity here if necessary
    CenterEntity resultEntity = getCenterRepository().save(centerEntity);
    LOG.debug("Center with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, CenterEto.class);
  }
}
