package com.woniu.his.mapper;

import com.woniu.his.pojo.Order;
import com.woniu.his.pojo.OrderVo;
import com.woniu.his.vo.OrderQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    OrderVo selectByPrimaryKey(Integer orderId);

    List<OrderVo> selectAll();

    List<OrderVo> selectByOrderQueryVo(@Param("qv") OrderQueryVo orderQueryVo);

    int updateByPrimaryKey(Order record);
}
