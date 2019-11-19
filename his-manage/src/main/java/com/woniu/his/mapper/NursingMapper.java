package com.woniu.his.mapper;

import com.woniu.his.pojo.Nursing;
import com.woniu.his.pojo.NursingVo;
import com.woniu.his.vo.NursingQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NursingMapper {
    int deleteByPrimaryKey(Integer nurId);

    int insert(Nursing record);

    NursingVo selectByPrimaryKey(Integer nurId);

    List<NursingVo> selectAll();

    List<NursingVo> selectByNursingQueryVo(@Param("qv") NursingQueryVo nursingQueryVo);

    int updateByPrimaryKey(Nursing record);
}
