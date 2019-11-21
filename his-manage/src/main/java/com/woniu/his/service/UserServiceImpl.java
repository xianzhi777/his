package com.woniu.his.service;

import com.woniu.his.mapper.UserMapper;
import com.woniu.his.pojo.User;
import com.woniu.his.pojo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/19
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserVo> findAll() {

        return userMapper.selectAll();
    }

    @Override
    public void modifyOne(User user) { userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void removeById(Integer id) {
        User user=userMapper.selectByPrimaryKey(id);
        user.setFlag(0);
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void addUser(User user) {
        user.setCreateTime(new Date());
        userMapper.insert(user);
    }
}
