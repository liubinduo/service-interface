package com.v1ok.db.model;

import java.util.Date;

public interface ICreateByModel {

  Long getCreateBy();

  void setCreateBy(Long createBy);

  Date getCreateTime();

  void setCreateTime(Date createTime);
}
