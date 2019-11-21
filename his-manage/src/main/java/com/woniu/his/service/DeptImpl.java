package com.woniu.his.service;

import com.woniu.his.mapper.DepartmentMapper;
import com.woniu.his.pojo.Department;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DeptImpl implements IDeptService {
    @Resource
    DepartmentMapper departmentMapper;
    @Override
    public List<Department> selectAll() {
        return departmentMapper.selectAll();
    }
}
