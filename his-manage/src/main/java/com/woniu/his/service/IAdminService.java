package com.woniu.his.service;

import com.woniu.his.pojo.AdminVo;
import com.woniu.his.vo.AdminQueryVo;

import java.util.List;


public interface IAdminService {

    List<AdminVo> selectAdminByAccountAndPassword(AdminQueryVo adminQueryVo);
}