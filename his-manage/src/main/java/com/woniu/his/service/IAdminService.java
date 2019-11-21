package com.woniu.his.service;

import com.woniu.his.pojo.Admin;
import com.woniu.his.pojo.AdminVo;
import com.woniu.his.vo.AdminQueryVo;

import java.util.List;


public interface IAdminService {

    List<AdminVo> selectAdminByAccountAndPassword(AdminQueryVo adminQueryVo);

    List<AdminVo> selectAllAdmin3();

    int insertAdmin3(Admin admin);

    int updateAdmin3(Admin admin);
}
