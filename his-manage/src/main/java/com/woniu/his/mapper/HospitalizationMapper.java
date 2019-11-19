package com.woniu.his.mapper;

import com.woniu.his.pojo.Hospitalization;
import com.woniu.his.pojo.HospitalizationVo;
import com.woniu.his.vo.HospitalizationQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HospitalizationMapper {
    int deleteByPrimaryKey(Integer hosId);

    int insert(Hospitalization record);

    HospitalizationVo selectByPrimaryKey(Integer hosId);

    List<HospitalizationVo> selectAll();

    List<HospitalizationVo> selectByHospitalizationQueryVo(@Param("qv") HospitalizationQueryVo hospitalizationQueryVo);

    int updateByPrimaryKey(Hospitalization record);
}
