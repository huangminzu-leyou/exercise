package com.springcloud.resttemplateserver.controller;

import com.springcloud.resttemplateserver.pojo.User;
import com.springcloud.resttemplateserver.service.UserService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangyi
 * @date 2019/10/9 23:09
 */
@RestController
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/user/find")
    public User view(@RequestParam Long id) {
        return userService.findById(id);
    }

    @RequestMapping("/user/add")
    public User add() {
        User user = new User();
        user.setUserName("sisi");
        user.setName("sf");
        user.setAge(12);
        userService.add(user);
        return user;
    }
}
