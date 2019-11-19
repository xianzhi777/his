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

public class CaseHistory {
    private Integer chId;
    private Date createTime;
    private String description;
    private Integer flag;
    private Integer adminId;
    private Integer userId;
    private Integer diseaseId;

    public Integer getChId() {
        return chId;
    }

    public void setChId(Integer chId) {
        this.chId = chId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
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

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    @Override
    public String toString() {
        return "CaseHistory{" +
                "chId=" + chId +
                ", createTime=" + createTime +
                ", description='" + description + '\'' +
                ", flag=" + flag +
                ", adminId=" + adminId +
                ", userId=" + userId +
                ", diseaseId=" + diseaseId +
                '}';
    }
}
