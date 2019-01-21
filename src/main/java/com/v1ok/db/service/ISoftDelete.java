package com.v1ok.db.service;

public interface ISoftDelete {

  Boolean isDeleted();

  void setDeleted(Boolean deleted);
}
