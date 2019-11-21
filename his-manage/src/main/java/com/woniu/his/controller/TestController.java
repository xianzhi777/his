package com.woniu.his.controller;

import com.woniu.his.config.RabbitmqConfig;
import com.woniu.his.pojo.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;


@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @RequestMapping("/test")
    public void testUser(){
        User user=new User();
        user.setUserId(1);
        user.setUserName("aaa");
        rabbitTemplate.convertAndSend(RabbitmqConfig.EXCHANGE_TOPICS_INFORM,"inform.email",user.toString());
    }
}
