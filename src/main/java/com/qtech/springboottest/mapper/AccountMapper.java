package com.qtech.springboottest.mapper;

import com.qtech.springboottest.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Description: ${description}
 * @Date: 2019/10/14 15:39
 * @Version: 1.0
 */

@Component
@Mapper
public interface AccountMapper {
    //登录
    public Account login(String username, String password);

    //注册
}
