package com.woniu.his.service;

import com.woniu.his.pojo.OrderVo;

import java.util.List;

public interface IOrderService {
    List<OrderVo> findAll();
    int delById(Integer id);
}
