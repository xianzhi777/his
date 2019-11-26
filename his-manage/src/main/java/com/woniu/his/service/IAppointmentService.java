package com.woniu.his.service;

import com.woniu.his.pojo.Appointment;
import com.woniu.his.pojo.AppointmentVo;

import java.util.Date;
import java.util.List;

public interface IAppointmentService {
    List<AppointmentVo> findAllNoBedByDatetime(String startTime,String endTime);
    List<AppointmentVo> findAllNoBed();
    List<AppointmentVo> findAllBed();
    List<AppointmentVo> findAllBedByDatetime(String startTime, String endTime);
    Appointment findById();
    List<AppointmentVo> findAll();
    List<AppointmentVo> selectAllAppoByDatetime(String startTime,String endTime);
    void addAppointmentToRedis(AppointmentVo appointmentVo);
}
