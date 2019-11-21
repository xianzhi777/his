package com.woniu.his.service;

import com.woniu.his.mapper.OrderMapper;
import com.woniu.his.pojo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<OrderVo> findAll() {
        return orderMapper.selectAll();
    }

    @Override
    public int delById(Integer id) {
        return orderMapper.deleteByPrimaryKey(id);
    }
}
