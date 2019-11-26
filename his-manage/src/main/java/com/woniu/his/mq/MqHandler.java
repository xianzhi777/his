package com.woniu.his.mq;

import com.alibaba.fastjson.JSONArray;
import com.woniu.his.config.RabbitmqConfig;
import com.woniu.his.pojo.AppointmentVo;
import com.woniu.his.util.TimeFormatUtil;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import java.util.Set;


@Component
public class MqHandler {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @RabbitListener(queues = {RabbitmqConfig.QUEUE_INFORM_SURGERY})
    public void getSurgery(String appointmentVo) {
        AppointmentVo a = JSONArray.parseObject(appointmentVo, AppointmentVo.class);
        String dateStr=TimeFormatUtil.getDateString(a.getAppoTime());
        redisTemplate.opsForValue().set(dateStr,a.getUserId().toString());
    }

    @RabbitListener(queues = {RabbitmqConfig.QUEUE_INFORM_INYERNAL})
    public void getInyernal(String appointVo) {
        AppointmentVo a = JSONArray.parseObject(appointVo, AppointmentVo.class);
        String dateStr=TimeFormatUtil.getDateString(a.getAppoTime());
        redisTemplate.opsForValue().set(dateStr,a.getUserId().toString());
    }

    //清空数据库
    public void deleteAll(){
        Set<String> keys=redisTemplate.keys("*");
        redisTemplate.delete(keys);
    }
}
