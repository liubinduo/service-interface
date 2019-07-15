package com.v1ok.db.model;


import java.io.Serializable;

/**
 * Created by liubinduo on 2017/6/28.
 */
public interface IEntityModel<ID extends Serializable>  extends Serializable {

  ID getPid();

  void setPid(ID id);


  String getName();

  void setName(String name);


}
