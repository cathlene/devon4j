package com.devonfw.application.jtqj.centermanagement.logic.api.usecase;

import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterEto;

/**
 * Interface of UcManageCenter to centralize documentation and signatures of methods.
 */
public interface UcManageCenter {

  /**
   * Deletes a center from the database by its id 'centerId'.
   *
   * @param centerId Id of the center to delete
   * @return boolean <code>true</code> if the center can be deleted, <code>false</code> otherwise
   */
  boolean deleteCenter(long centerId);

  /**
   * Saves a center and store it in the database.
   *
   * @param center the {@link CenterEto} to create.
   * @return the new {@link CenterEto} that has been saved with ID and version.
   */
  CenterEto saveCenter(CenterEto center);

}
