package com.woniu.his.mapper;

import com.woniu.his.pojo.Department;
import com.woniu.his.vo.DepartmentQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(Department record);

    Department selectByPrimaryKey(Integer deptId);

    List<Department> selectAll();

    List<Department> selectByDepartmentQueryVo(@Param("qv") DepartmentQueryVo departmentQueryVo);

    int updateByPrimaryKey(Department record);
}
