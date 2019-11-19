package com.woniu.his.pojo;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/18
 * @since 1.0.0
 */

public class Operation {
    private Integer oprId;
    private String oprName;
    private Double oprPrice;
    private Integer flag;

    public Integer getOprId() {
        return oprId;
    }

    public void setOprId(Integer oprId) {
        this.oprId = oprId;
    }

    public String getOprName() {
        return oprName;
    }

    public void setOprName(String oprName) {
        this.oprName = oprName;
    }

    public Double getOprPrice() {
        return oprPrice;
    }

    public void setOprPrice(Double oprPrice) {
        this.oprPrice = oprPrice;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "oprId=" + oprId +
                ", oprName='" + oprName + '\'' +
                ", oprPrice=" + oprPrice +
                ", flag=" + flag +
                '}';
    }
}
