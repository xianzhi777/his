package com.woniu.his.controller;

import com.woniu.his.pojo.Department;
import com.woniu.his.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/21
 * @since 1.0.0
 */
@RestController
@RequestMapping("dept")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @GetMapping("all")
    public List<Department> getAll(){
        return departmentService.findAll();
    }
    @DeleteMapping("del/{id}")
    public Integer del(@PathVariable("id") Integer id){
        departmentService.removeById(id);
        return 1;
    }
    @PostMapping("add")
    public Integer addDept(@RequestBody Department department){
        departmentService.addDept(department);
        return 1;
    }
}
