package com.fzp.model.entity;


public class SyOrgUser {

  private long uid;
  private String name;
  private String sex;
  private String telphone;
  private String mail;


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getTelphone() {
    return telphone;
  }

  public void setTelphone(String telphone) {
    this.telphone = telphone;
  }


  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  @Override
  public String toString() {
    return "SyOrgUser{" +
            "uid=" + uid +
            ", name='" + name + '\'' +
            ", sex='" + sex + '\'' +
            ", telphone='" + telphone + '\'' +
            ", mail='" + mail + '\'' +
            '}';
  }
}
