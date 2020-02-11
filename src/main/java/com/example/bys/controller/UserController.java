package com.example.bys.controller;

import com.example.bys.entity.UserEntity;
import com.example.bys.result.Result;
import com.example.bys.service.UserServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @CrossOrigin //解决跨域支持问题
    @GetMapping(value = "api/selectAllUser")
    @ResponseBody
    public PageInfo selectAllUser(@RequestParam(defaultValue = "1") int pageNum){
        //System.out.println("tt");
        //分页插件 pageNum:第几页  pageSize:显示多少行
        PageHelper.startPage(pageNum,5);
        List<UserEntity> userEntityList = userService.selectAllUser();
        PageInfo pageInfo=new PageInfo(userEntityList);
        return pageInfo;
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

    @CrossOrigin //解决跨域支持问题
    @GetMapping(value = "api/deleteUser")
    @ResponseBody
    public Result deleteUser(@RequestParam String username){
        userService.deleteUser(username);
        System.out.println("delete成功");
        return new Result(200);
    }

    @CrossOrigin //解决跨域支持问题
    @PostMapping(value = "api/updateUser")
    @ResponseBody
    public Result updateUser(@RequestBody UserEntity userEntity){
        userService.updateUser(userEntity);
        System.out.println("update成功");
        return new Result(200);
    }





}
