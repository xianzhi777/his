package com.woniu.his.pojo;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/18
 * @since 1.0.0
 */

public class Nation {
    private Integer nationId;
    private String nationName;
    private String eSpell;
    private String simple;


    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String geteSpell() {
        return eSpell;
    }

    public void seteSpell(String eSpell) {
        this.eSpell = eSpell;
    }

    public String getSimple() {
        return simple;
    }

    public void setSimple(String simple) {
        this.simple = simple;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "nationId=" + nationId +
                ", nationName='" + nationName + '\'' +
                ", eSpell='" + eSpell + '\'' +
                ", simple='" + simple + '\'' +
                '}';
    }
}
