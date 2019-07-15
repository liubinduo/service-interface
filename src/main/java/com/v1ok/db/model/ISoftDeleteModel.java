package com.v1ok.db.model;

public interface ISoftDeleteModel {

  Boolean isDeleted();

  void setDeleted(Boolean deleted);
}
