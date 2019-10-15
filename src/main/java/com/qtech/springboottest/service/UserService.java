package com.qtech.springboottest.service;

import com.qtech.springboottest.entity.Account;

/**
 * @Description: ${description}
 * @Date: 2019/10/14 15:21
 * @Version: 1.0
 */
public interface UserService {
    //登录
    public Account login(String username, String password)throws Exception;

    //注册
    public Account register(String username, String password);

}
