package com.woniu.his.pojo;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/18
 * @since 1.0.0
 */

public class Bed {
    private Integer bedId;
    private String floor;
    private String bedNum;
    private Integer status;

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getBedNum() {
        return bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "bedId=" + bedId +
                ", floor='" + floor + '\'' +
                ", bedNum='" + bedNum + '\'' +
                ", status=" + status +
                '}';
    }
}
