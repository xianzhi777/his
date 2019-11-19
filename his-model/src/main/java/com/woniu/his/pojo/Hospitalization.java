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

public class Hospitalization {
    private Integer hosId;
    private Integer userId;
    private Date startTime;
    private Date endTime;
    private Integer bedId;
    private Integer adminId;
    private Integer flag;

    public Integer getHosId() {
        return hosId;
    }

    public void setHosId(Integer hosId) {
        this.hosId = hosId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Hospitalization{" +
                "hosId=" + hosId +
                ", userId=" + userId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", bedId=" + bedId +
                ", adminId=" + adminId +
                ", flag=" + flag +
                '}';
    }
}
