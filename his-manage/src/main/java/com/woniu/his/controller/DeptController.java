package com.woniu.his.controller;

import com.woniu.his.pojo.Department;
import com.woniu.his.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    IDeptService deptService;
    @RequestMapping("/all")
    public List<Department> selectAll(){
        return deptService.selectAll();
    }
}
