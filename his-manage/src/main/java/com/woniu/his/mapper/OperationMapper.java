package com.woniu.his.mapper;

import com.woniu.his.pojo.Operation;
import com.woniu.his.vo.OperationQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OperationMapper {
    int deleteByPrimaryKey(Integer oprId);

    int insert(Operation record);

    Operation selectByPrimaryKey(Integer oprId);

    List<Operation> selectAll();

    List<Operation> selectByOperationQueryVo(@Param("qv") OperationQueryVo operationQueryVo);

    int updateByPrimaryKey(Operation record);
}
