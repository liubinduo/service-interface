package com.v1ok.db.model;

import java.util.Date;

public interface IUpdateByModel {

  Long getUpdateBy();

  void setUpdateBy(Long updateBy);

  Date getUpdateTime();

  void setUpdateTime(Date updateTime);
}
