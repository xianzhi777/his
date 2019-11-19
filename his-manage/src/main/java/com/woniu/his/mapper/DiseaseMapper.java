package com.woniu.his.mapper;

import com.woniu.his.pojo.Disease;
import com.woniu.his.vo.DiseaseQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiseaseMapper {
    int deleteByPrimaryKey(Integer diseaseId);

    int insert(Disease record);

    Disease selectByPrimaryKey(Integer diseaseId);

    List<Disease> selectAll();

    List<Disease> selectByDiseaseQueryVo(@Param("qv") DiseaseQueryVo diseaseQueryVo);

    int updateByPrimaryKey(Disease record);
}
