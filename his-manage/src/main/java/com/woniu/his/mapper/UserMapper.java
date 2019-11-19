package com.woniu.his.mapper;

import com.woniu.his.pojo.User;
import com.woniu.his.pojo.UserVo;
import com.woniu.his.vo.UserQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    UserVo selectByPrimaryKey(Integer userId);

    List<UserVo> selectAll();

    List<UserVo> selectByUserQueryVo(@Param("qv") UserQueryVo userQueryVo);

    int updateByPrimaryKey(User record);
}
