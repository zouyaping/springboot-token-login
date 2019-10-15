package com.qtech.springboottest.service.Impl;

import com.qtech.springboottest.entity.Account;
import com.qtech.springboottest.exception.MyException;
import com.qtech.springboottest.mapper.AccountMapper;
import com.qtech.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: ${description}
 * @Date: 2019/10/14 15:23
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account login(String username, String password)throws Exception {
        Account login = null;
        try {
            login = accountMapper.login(username,password);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException("登录异常。。。。。。。。。。");
        }
        return login;
    }

    @Override
    public Account register(String name, String password) {
        return null;
    }
}
