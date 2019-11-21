package com.woniu.his.service;

import com.woniu.his.mapper.AppointmentMapper;
import com.woniu.his.pojo.Appointment;
import com.woniu.his.pojo.AppointmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AppointmentServiceImpl implements IAppointmentService {
    @Autowired
    AppointmentMapper appointmentMapper;

    @Override
    public List<AppointmentVo> findAllNoBedByDatetime(String startTime, String endTime) {
        return appointmentMapper.selectAllNoBedByDatetime(startTime,endTime);
    }

    @Override
    public List<AppointmentVo> findAllNoBed() {
        return appointmentMapper.selectAllNoBed();
    }

    @Override
    public List<AppointmentVo> findAllBed() {
        return appointmentMapper.selectAllBed();
    }

    @Override
    public List<AppointmentVo> findAllBedByDatetime(String startTime, String endTime) {
        return appointmentMapper.selectAllBedByDatetime(startTime,endTime);
    }


    @Override
    public Appointment findById() {
        return null;
    }
}
