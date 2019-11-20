package com.woniu.his.pojo;

import lombok.Data;
import lombok.Value;
import lombok.experimental.Accessors;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/19
 * @since 1.0.0
 */
@Data
public class AdminVo extends Admin{
    private String nationName;
    private String eSpell;
    private String simple;
    private String deptName;
    private String levelName;
}
