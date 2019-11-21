package com.woniu.his.service;

import com.woniu.his.mapper.DepartmentMapper;
import com.woniu.his.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/21
 * @since 1.0.0
 */
@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public List<Department> findAll() {
        return departmentMapper.selectAll();
    }

    @Override
    public void removeById(Integer id) {
        departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addDept(Department department) {
        departmentMapper.insert(department);
    }
}
