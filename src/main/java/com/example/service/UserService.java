package com.example.service;

import com.example.domain.User;

/**
 * @Author Peng
 * @Date 2020/8/14 12:30
 */
public interface UserService {
    User findByName(String name);

    User findById(Integer id);
}
