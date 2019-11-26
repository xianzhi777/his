package com.woniu.his.config;

import com.woniu.his.mq.MqHandler;
import com.woniu.his.util.AppointmentTimeTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
/*
* 项目启动时自动加载
* 每24小时自动执行一次*/
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Autowired
    AppointmentTimeTask appointmentTimeTask;
    @Autowired
    MqHandler mqHandler;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Timer timer=new Timer();
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        calendar.add(Calendar.SECOND,3);
        mqHandler.deleteAll();
        timer.schedule(appointmentTimeTask,calendar.getTime(),(long)24*60*60*1000);
    }
}
