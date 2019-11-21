package com.woniu.his.controller;

import com.woniu.his.pojo.AppointmentVo;
import com.woniu.his.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
    @Autowired
    IAppointmentService appointmentService;

    //普通预约
    @GetMapping("findAllNoBed")
    public List<AppointmentVo> findAllNoBed(){
        return appointmentService.findAllNoBed();
    }
    //床位预约
    @GetMapping("findAllBed")
    public List<AppointmentVo> findAllBed(){
        return appointmentService.findAllBed();
    }

    @GetMapping("findAllNoBedByDatetime")
    public List<AppointmentVo> findAllNoBedByDatetime(@RequestParam("startTime") String startTime,@RequestParam("endTime") String endTime){
        System.out.println(startTime);
        System.out.println(endTime);
        return appointmentService.findAllNoBedByDatetime(startTime,endTime);
    }

    @GetMapping("findAllBedByDatetime")
    public List<AppointmentVo> findAllBedByDatetime(@RequestParam("startTime") String startTime,@RequestParam("endTime") String endTime){
        return appointmentService.findAllBedByDatetime(startTime,endTime);
    }
}
