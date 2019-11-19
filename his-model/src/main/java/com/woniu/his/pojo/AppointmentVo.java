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
public class AppointmentVo extends Appointment {
    private String userName;
    private String adminName;
    private String floor;
    private String bedNum;
}
