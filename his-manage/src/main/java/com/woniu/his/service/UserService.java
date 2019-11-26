package com.woniu.his.service;

import com.woniu.his.pojo.User;
import com.woniu.his.pojo.UserVo;

import java.util.List;

public interface UserService {
    List<UserVo> findAll();

    void modifyOne(User user);

    void removeById(Integer id);

    void addUser(User user);

    UserVo getUserById(int id);
}
