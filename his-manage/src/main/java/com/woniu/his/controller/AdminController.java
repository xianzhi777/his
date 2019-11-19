package com.woniu.his.controller;

import com.woniu.his.pojo.AdminVo;
import com.woniu.his.pojo.User;
import com.woniu.his.service.IAdminService;
import com.woniu.his.vo.AdminQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    IAdminService adminService;
    @RequestMapping("/login")
    public AdminVo AdminLogin(@RequestBody AdminQueryVo adminQueryVo){
        List<AdminVo> list=adminService.selectAdminByAccountAndPassword(adminQueryVo);
        if(list.size()==0){
            return null;
        }
        return list.get(0);
    }
}
