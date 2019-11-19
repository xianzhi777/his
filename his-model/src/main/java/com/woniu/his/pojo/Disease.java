package com.woniu.his.pojo;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/18
 * @since 1.0.0
 */

public class Disease {
    private Integer diseaseId;
    private String diseaseName;

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "diseaseId=" + diseaseId +
                ", diseaseName='" + diseaseName + '\'' +
                '}';
    }
}
