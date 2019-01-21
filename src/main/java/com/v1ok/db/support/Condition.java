package com.v1ok.db.support;

import java.util.Date;

/**
 * 查询条件
 *
 * Created by Delong on 2017/11/19.
 */
public class Condition {

  /**
   * 字段名
   */
  private String column;

  /**
   * 字段值
   */
  private Object value;

  /**
   * 操作符
   */
  private String option;

  /**
   * 开始时间
   */
  private Date start;

  /**
   * 结束时间
   */
  private Date end;

  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }

  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public Object getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }
}
