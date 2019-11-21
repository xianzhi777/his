package com.woniu.his.service;

import com.woniu.his.pojo.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();

    void removeById(Integer id);

    void addDept(Department department);
}
