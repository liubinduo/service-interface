package com.v1ok.db.model;

import java.util.Date;

public interface IUpdateByModel {

  String getUpdateBy();

  void setUpdateBy(String updateBy);

  Date getUpdateTime();

  void setUpdateTime(Date updateTime);
}
