package com.woniu.his.pojo;

import java.util.Date;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/18
 * @since 1.0.0
 */

public class Appointment {
    private Integer appoId;
    private Integer userId;
    private Date createTime;
    private Date appoTime;
    private Integer adminId;
    private Integer bedId;
    private Integer status;
    private Integer flag;

    public Integer getAppoId() {
        return appoId;
    }

    public void setAppoId(Integer appoId) {
        this.appoId = appoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getAppoTime() {
        return appoTime;
    }

    public void setAppoTime(Date appoTime) {
        this.appoTime = appoTime;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appoId=" + appoId +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", appoTime=" + appoTime +
                ", adminId=" + adminId +
                ", bedId=" + bedId +
                ", status=" + status +
                ", flag=" + flag +
                '}';
    }
}
