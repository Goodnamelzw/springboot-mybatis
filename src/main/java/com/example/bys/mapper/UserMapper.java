package com.example.bys.mapper;

import com.example.bys.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     *
     * @return 查询所有用户
     */
    List<UserEntity> selectAllUser();

    /**
     *
     * @param id 用户id
     * @return 查询单个用户
     */
    UserEntity selectOneUser(int id);

    /**
     *
     * @param userEntity 插入用户
     * @return 插入的用户
     */
    void insertUser(UserEntity userEntity);

    /**
     *
     * @param id 删除用户的id
     */
    void deleteUser(int id);

    /**
     *
     * @param userEntity 更新用户的数据
     */
    void updateUser(UserEntity userEntity);
}
