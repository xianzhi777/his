package com.woniu.his.mapper;

import com.woniu.his.pojo.Bed;
import com.woniu.his.vo.BedQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BedMapper {
    int deleteByPrimaryKey(Integer bedId);

    int insert(Bed record);

    Bed selectByPrimaryKey(Integer bedId);

    List<Bed> selectAll();

    List<Bed> selectByBedQueryVo(@Param("qv") BedQueryVo bedQueryVo);

    int updateByPrimaryKey(Bed record);
}
