package com.woniu.his.pojo;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/18
 * @since 1.0.0
 */

public class Medicine {
    private Integer medicineId;
    private String medicineName;
    private Integer medicineCount;
    private Double medicinePrice;
    private Integer flag;
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public Integer getMedicineCount() {
        return medicineCount;
    }

    public void setMedicineCount(Integer medicineCount) {
        this.medicineCount = medicineCount;
    }

    public Double getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(Double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineId=" + medicineId +
                ", medicineName='" + medicineName + '\'' +
                ", medicineCount=" + medicineCount +
                ", medicinePrice=" + medicinePrice +
                ", flag=" + flag +
                ", status=" + status +
                '}';
    }
}
