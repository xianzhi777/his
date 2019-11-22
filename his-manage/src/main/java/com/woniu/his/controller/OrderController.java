package com.woniu.his.controller;

import com.woniu.his.pojo.OrderVo;
import com.woniu.his.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @GetMapping("findAll")
    public List<OrderVo> findAll(){
        return orderService.findAll();
    }

    @DeleteMapping("delById/{id}")
    public int delById(@PathVariable("id") Integer id){
        return orderService.delById(id);
    }
}
