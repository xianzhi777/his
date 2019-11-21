package com.woniu.his.controller;

import com.rabbitmq.client.*;
import com.woniu.his.config.RabbitmqConfig;
import com.woniu.his.pojo.User;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Controller
public class OrderController {

    @RabbitListener(queues = {RabbitmqConfig.QUEUE_INFORM_EMAIL})
    public void send_email(String msg, Message message, Channel channel){
        System.out.println("QUEUE_INFORM_EMAIL:"+msg);
    }


    @RabbitListener(queues = {RabbitmqConfig.QUEUE_INFORM_EMAIL})
    public void send_email2(String msg, Message message, Channel channel){
        System.out.println("QUEUE_INFORM_EMAIL2:"+msg);
    }
}
