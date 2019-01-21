package com.v1ok.db.support;

import java.util.List;

/**
 * 高级查询组 Created by Delong 2017/11/19
 */
public class Group {

  /**
   * 基础WHERE条件
   */
  private List<Condition> conditions;

  /**
   * WHERE条件连接符 AND/OR
   */
  private String option;

  public List<Condition> getConditions() {
    return conditions;
  }

  public void setConditions(List<Condition> conditions) {
    this.conditions = conditions;
  }

  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }
}
