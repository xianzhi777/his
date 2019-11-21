package com.woniu.his.controller;

import com.woniu.his.pojo.User;
import com.woniu.his.pojo.UserVo;
import com.woniu.his.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/19
 * @since 1.0.0
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("all")
    public List<UserVo> showAll(){
        return userService.findAll();
    }
    @PutMapping("upd")
    public Integer upd(@RequestBody User user){
       userService.modifyOne(user);
       return 1;
    }
    @DeleteMapping("del/{id}")
    public Integer del(@PathVariable("id") Integer id){
        userService.removeById(id);
        return 1;
    }
    @PostMapping("add")
    public Integer addUser(@RequestBody User user){
        userService.addUser(user);
        return 1;
    }
}
