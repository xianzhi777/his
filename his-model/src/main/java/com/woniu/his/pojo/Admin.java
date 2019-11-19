package com.woniu.his.pojo;

import java.util.Date;

public class Admin {
    private Integer adminId;

    private String account;

    private String adminName;

    private String address;

    private Date createTime;

    private String creditNum;

    private Integer deptId;

    private Integer flag;

    private Integer levelId;

    private Integer nationId;

    private String password;

    private String phoneNum;

    private String photoUrl;

    private String sex;

    private Integer status;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreditNum() {
        return creditNum;
    }

    public void setCreditNum(String creditNum) {
        this.creditNum = creditNum == null ? null : creditNum.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", account='" + account + '\'' +
                ", adminName='" + adminName + '\'' +
                ", address='" + address + '\'' +
                ", createTime=" + createTime +
                ", creditNum='" + creditNum + '\'' +
                ", deptId=" + deptId +
                ", flag=" + flag +
                ", levelId=" + levelId +
                ", nationId=" + nationId +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", sex='" + sex + '\'' +
                ", status=" + status +
                '}';
    }
}
