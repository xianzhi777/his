package com.woniu.his.service;

import com.woniu.his.pojo.*;

import javax.annotation.Resource;

public class MoneyServiceImpl implements IMoneyService {
    @Resource
    UserService userService;
    @Resource
    IAdminService adminService;

    /*交挂号费
    * 主任医师50
    * 其他10*/
    @Override
    public Double getRegisrationFee(AppointmentVo appointmentVo) {
        UserVo user =userService.getUserById(appointmentVo.getUserId());
        AdminVo admin=adminService.selectAdminById(appointmentVo.getAdminId());
        if(admin.getLevelId()==4){
            if(user.getBalance()>=50){
                user.setBalance(user.getBalance()-50);
                userService.modifyOne(user);
                return 0.0;
            }else {
                user.setBalance(0.0);
                return  (50-user.getBalance());
            }
        }
        if(user.getBalance()>=10){
            user.setBalance(user.getBalance()-10);
            userService.modifyOne(user);
            return 0.0;
        }
        return  (10-user.getBalance());
    }
}
