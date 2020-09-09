package com.example.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Author Peng
 * @Date 2020/8/14 12:15
 */
@Data
public class User {

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 权限值
     */
    private String perms;

}
