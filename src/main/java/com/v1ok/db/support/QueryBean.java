package com.v1ok.db.support;

import java.util.List;

/**
 * 高级查询类 Created by Delong 2017/11/19
 */
public class QueryBean {

  /**
   * 页号
   */
  private int pageNo;

  /**
   * 页大小
   */
  private int pageSize;

  /**
   * 查询条件组连接符 AND/OR
   */
  private String option;

  /**
   * 查询条件组
   */
  private List<Group> groups;

  /**
   * 排序字段
   */
  private String orderBy;

  /**
   * 默认ASC
   */
  private boolean isDesc;

  public int getPageNo() {
    return pageNo;
  }

  public void setPageNo(int pageNo) {
    this.pageNo = pageNo;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }

  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  public boolean isDesc() {
    return isDesc;
  }

  public void setDesc(boolean desc) {
    isDesc = desc;
  }
}
