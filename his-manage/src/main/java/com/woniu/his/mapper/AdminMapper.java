package com.woniu.his.mapper;

import com.woniu.his.pojo.Admin;
import com.woniu.his.pojo.AdminVo;
import com.woniu.his.vo.AdminQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    AdminVo selectByPrimaryKey(Integer adminId);

    List<AdminVo> selectAll();

    List<AdminVo> selectByAdminQueryVo(@Param("qv") AdminQueryVo adminQueryVo);

    int updateByPrimaryKey(Admin record);
}
