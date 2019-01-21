package com.v1ok.db.service;

import java.util.Date;

public interface IUpdateBy {

  Long getUpdateBy();

  void setUpdateBy(Long updateBy);

  Date getUpdateTime();

  void setUpdateTime(Date updateTime);
}
