package com.springcloud.resttemplateserver.service;

import com.springcloud.resttemplateserver.mapper.UserMapper;
import com.springcloud.resttemplateserver.pojo.User;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author huangyi
 * @date 2019/10/9 23:10
 */
@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public void add(User user) {
        userMapper.insert(user);
    }
}
