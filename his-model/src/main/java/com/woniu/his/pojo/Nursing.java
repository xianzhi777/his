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

public class Nursing {
    private Integer nurId;
    private Integer adminId;
    private Integer userId;
    private Integer bedId;
    private Date nurDate;
    private String detail;

    public Integer getNurId() {
        return nurId;
    }

    public void setNurId(Integer nurId) {
        this.nurId = nurId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public Date getNurDate() {
        return nurDate;
    }

    public void setNurDate(Date nurDate) {
        this.nurDate = nurDate;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Nursing{" +
                "nurId=" + nurId +
                ", adminId=" + adminId +
                ", userId=" + userId +
                ", bedId=" + bedId +
                ", nurDate=" + nurDate +
                ", detail='" + detail + '\'' +
                '}';
    }
}
