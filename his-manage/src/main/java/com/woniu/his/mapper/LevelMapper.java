package com.woniu.his.mapper;

import com.woniu.his.pojo.Level;
import com.woniu.his.vo.LevelQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LevelMapper {
    int deleteByPrimaryKey(Integer levelId);

    int insert(Level record);

    Level selectByPrimaryKey(Integer levelId);

    List<Level> selectAll();

    List<Level> selectByLevelQueryVo(@Param("qv") LevelQueryVo levelQueryVo);

    int updateByPrimaryKey(Level record);
}
