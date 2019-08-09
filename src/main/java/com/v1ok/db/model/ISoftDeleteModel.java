package com.v1ok.db.model;

public interface ISoftDeleteModel {

  Boolean getDeleted();

  void setDeleted(Boolean deleted);
}
