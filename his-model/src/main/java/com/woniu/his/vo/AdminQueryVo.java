package com.woniu.his.vo;

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
public class AdminQueryVo {
    private String account;
    private String password;
    private String adminName;
    private Integer status;
    private String hStatus;
}
