package com.example.mapper;

import com.example.domain.User;

/**
 * @Author Peng
 * @Date 2020/8/14 12:19
 */
public interface UserMapper {

    User findByName(String name);

    User findById(Integer id);
}
