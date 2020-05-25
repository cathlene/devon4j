package com.devonfw.application.jtqj.peoplemanagement.logic.api.usecase;

import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleEto;

/**
 * Interface of UcManagePeople to centralize documentation and signatures of methods.
 */
public interface UcManagePeople {

  /**
   * Deletes a people from the database by its id 'peopleId'.
   *
   * @param peopleId Id of the people to delete
   * @return boolean <code>true</code> if the people can be deleted, <code>false</code> otherwise
   */
  boolean deletePeople(long peopleId);

  /**
   * Saves a people and store it in the database.
   *
   * @param people the {@link PeopleEto} to create.
   * @return the new {@link PeopleEto} that has been saved with ID and version.
   */
  PeopleEto savePeople(PeopleEto people);

}
