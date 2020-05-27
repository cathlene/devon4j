package com.devonfw.application.jtqj.centermanagement.dataaccess.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.devonfw.application.jtqj.centermanagement.common.api.Center;
import com.devonfw.application.jtqj.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author cvanmoor
 */
@Entity
@Table(name = "CENTER")
public class CenterEntity extends ApplicationPersistenceEntity implements Center {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_center")
  private Long id_center;

  private String center_name;

  private static final long serialVersionUID = 1L;

  /**
   * @return center_name
   */
  @Override
  public String getCenter_name() {

    return this.center_name;
  }

  /**
   * @param center_name new value of {@link #getcenter_name}.
   */
  @Override
  public void setCenter_name(String center_name) {

    this.center_name = center_name;
  }

  @Override
  public Long getId() {

    // TODO Auto-generated method stub
    return this.id_center;
  }

  @Override
  public void setId(Long id) {

    this.id_center = id;

  }

}
