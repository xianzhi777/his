package com.woniu.his.pojo;

import lombok.Data;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/19
 * @since 1.0.0
 */
@Data
public class CaseHistoryVo extends CaseHistory {
    private String adminName;
    private String userName;
    private String diseaseName;
    private Integer medicineId;
    private String medicineName;
    private Integer useCount;
    private Integer oprId;
    private String oprName;
}
