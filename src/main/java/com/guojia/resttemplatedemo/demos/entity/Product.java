package com.guojia.resttemplatedemo.demos.entity;


import com.alibaba.fastjson2.JSON;

public class Product {

  private int pid;
  private String pname;
  private String pdescription;
  private String ptype;
  private long pinventory;
  private double punitprice;
  private java.sql.Timestamp pcreationtime;
  private java.sql.Timestamp pupdatetime;


  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }


  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }


  public String getPdescription() {
    return pdescription;
  }

  public void setPdescription(String pdescription) {
    this.pdescription = pdescription;
  }


  public String getPtype() {
    return ptype;
  }

  public void setPtype(String ptype) {
    this.ptype = ptype;
  }


  public long getPinventory() {
    return pinventory;
  }

  public void setPinventory(long pinventory) {
    this.pinventory = pinventory;
  }


  public double getPunitprice() {
    return punitprice;
  }

  public void setPunitprice(double punitprice) {
    this.punitprice = punitprice;
  }


  public java.sql.Timestamp getPcreationtime() {
    return pcreationtime;
  }

  public void setPcreationtime(java.sql.Timestamp pcreationtime) {
    this.pcreationtime = pcreationtime;
  }


  public java.sql.Timestamp getPupdatetime() {
    return pupdatetime;
  }

  public void setPupdatetime(java.sql.Timestamp pupdatetime) {
    this.pupdatetime = pupdatetime;
  }

  @Override
  public String toString() {
    return JSON.toJSONString(this);
  }
}