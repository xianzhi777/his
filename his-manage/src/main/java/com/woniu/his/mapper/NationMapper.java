package com.woniu.his.mapper;

import com.woniu.his.pojo.Nation;
import com.woniu.his.vo.NationQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NationMapper {
    int deleteByPrimaryKey(Integer nationId);

    int insert(Nation record);

    Nation selectByPrimaryKey(Integer nationId);

    List<Nation> selectAll();

    List<Nation> selectByNationQueryVo(@Param("qv") NationQueryVo nationQueryVo);

    int updateByPrimaryKey(Nation record);
}
