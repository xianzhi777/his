package com.woniu.his.service;

import com.woniu.his.pojo.AppointmentVo;

public interface IMoneyService {

    /*扣挂号费*/
    public Double getRegisrationFee(AppointmentVo appointmentVo);
}
