package com.woniu.his.service;

import com.woniu.his.mapper.OrderMapper;
import com.woniu.his.pojo.Operation;
import com.woniu.his.pojo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {
    @Resource
    OrderMapper orderMapper;
    @Override
    public List<OrderVo> findAll() {
        return orderMapper.selectAll();
    }

    @Override
    public int delById(Integer id) {
        return orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void countTotalPrice(Integer id) {
        double count=0;
        List<Operation> list=orderMapper.selectOperationByOrderID(id);
        for (Operation operation : list) {
            count+=operation.getOprPrice();
        }
    }
}
