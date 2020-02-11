package com.example.bys.service;


import com.example.bys.entity.UserEntity;
import com.example.bys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    UserMapper userMapper;

    public List<UserEntity> selectAllUser() {
        return userMapper.selectAllUser();
    }

    public UserEntity selectOneUser(int id) {
        return userMapper.selectOneUser(id);
    }
    public void insertUser(UserEntity userEntity){
        userMapper.insertUser(userEntity);
    }
    public void deleteUser(String id){
        userMapper.deleteUser(id);
    }
    public void updateUser(UserEntity userEntity){
        userMapper.updateUser(userEntity);
    }


}
