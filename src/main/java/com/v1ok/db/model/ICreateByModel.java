package com.v1ok.db.model;

import java.util.Date;

public interface ICreateByModel {

  String getCreateBy();

  void setCreateBy(String createBy);

  Date getCreateTime();

  void setCreateTime(Date createTime);
}
