package com.devonfw.application.jtqj.centermanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterEto;
import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterSearchCriteriaTo;

public interface UcFindCenter {

  /**
   * Returns a Center by its id 'id'.
   *
   * @param id The id 'id' of the Center.
   * @return The {@link CenterEto} with id 'id'
   */
  CenterEto findCenter(long id);

  /**
   * Returns a paginated list of Centers matching the search criteria.
   *
   * @param criteria the {@link CenterSearchCriteriaTo}.
   * @return the {@link List} of matching {@link CenterEto}s.
   */
  Page<CenterEto> findCenters(CenterSearchCriteriaTo criteria);

}
