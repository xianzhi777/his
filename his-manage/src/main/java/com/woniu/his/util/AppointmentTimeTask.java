package com.woniu.his.util;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONArray;
import com.woniu.his.config.RabbitmqConfig;
import com.woniu.his.pojo.AppointmentVo;
import com.woniu.his.service.IAppointmentService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

/*
*读取一天的预约信息并将其发送至消息队列
*  */
@Component
public class AppointmentTimeTask extends TimerTask {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired
    IAppointmentService appointmentService;
    @Override
    public void run() {
        Calendar calendar=Calendar.getInstance();
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String starttime=simpleDateFormat.format(calendar.getTime()).toString();
        String endTime=simpleDateFormat.format(new Date(date.getTime()+(long)24*60*60*1000)).toString();
        List<AppointmentVo> list=appointmentService.selectAllAppoByDatetime(starttime,endTime);
        for (AppointmentVo appointmentVo : list) {
           if(appointmentVo.getStatus()==1){
                rabbitTemplate.convertAndSend(RabbitmqConfig.EXCHANGE_TOPICS_INFORM,"inform.surgery", JSONArray.toJSONString(appointmentVo));
           }else if(appointmentVo.getStatus()==2){
               rabbitTemplate.convertAndSend(RabbitmqConfig.EXCHANGE_TOPICS_INFORM,"inform.internal",JSONArray.toJSONString(appointmentVo));
           }
        }
    }
}
