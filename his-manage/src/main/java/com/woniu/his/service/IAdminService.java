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

    List<AdminVo> findAllStaff();

    void modifyStaff(Admin admin);

    void addStaff(Admin admin);

    void removeStaffById(Integer id);

    AdminVo selectAdminById(int id);
}
