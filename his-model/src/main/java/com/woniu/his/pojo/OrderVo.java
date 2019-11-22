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
public class OrderVo extends Order{
    private String medicineName;
    private Double medicinePrice;
    private Integer count;
    private String oprName;
    private Double oprPrice;
    private String userName;
}
