package com.example.bys.controller;

import com.example.bys.entity.UserEntity;
import com.example.bys.result.Result;
import com.example.bys.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private UserServiceImpl userService;

    @CrossOrigin //解决跨域支持问题
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody UserEntity requestUser) {
        boolean ff = false;
        String username = requestUser.getUsername();
        String password = requestUser.getPassword();
        System.out.println("hello"+username+"  "+password);
        // 对 html 标签进行转义，防止 XSS 攻击
        //username = HtmlUtils.htmlEscape(username);

        List<UserEntity> userList = userService.selectAllUser();
        for(UserEntity user:userList){
            if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
                ff = true;
                break;
            }
        }
        if(ff) {
            ff = false;
            System.out.println("验证成功");
            return new Result(200);
        }
        else {
            System.out.println("验证失败");
            return new Result(404);
        }
    }

    @CrossOrigin //解决跨域支持问题
    @PostMapping(value = "api/reg")
    @ResponseBody
    public Result reg(@RequestBody UserEntity requestUser) {
        userService.insertUser(requestUser);
        return new Result(200);
    }

}
