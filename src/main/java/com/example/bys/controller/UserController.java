package com.example.bys.controller;

import com.example.bys.entity.UserEntity;
import com.example.bys.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/selectAllUser")
    public List<UserEntity> selectAllUser(){
        return userService.selectAllUser();
    }

    @RequestMapping("/selectOneUser")
    public UserEntity selectOneUser(int id){
        return userService.selectOneUser(id);
    }

    @PostMapping("/insertUser")
    public void insertUser(@RequestBody UserEntity userEntity){
         userService.insertUser(userEntity);
         System.out.println("insert成功");
    }

    @RequestMapping("/deleteUser")
    public void deleteUser(int id){
        userService.deleteUser(id);
        System.out.println("delete成功");
    }

    @PostMapping("/updateUser")
    public void updateUser(@RequestBody UserEntity userEntity){
        userService.updateUser(userEntity);
        System.out.println("update成功");
    }




}
