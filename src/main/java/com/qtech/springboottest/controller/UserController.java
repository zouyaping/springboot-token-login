package com.qtech.springboottest.controller;

import com.qtech.springboottest.entity.Account;
import com.qtech.springboottest.entity.Audience;
import com.qtech.springboottest.entity.Result;
import com.qtech.springboottest.service.UserService;
import com.qtech.springboottest.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * @Description: 账号接口
 * @Date: 2019/10/14 16:41
 * @Version: 1.0
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private Audience audience;

    @Autowired
    UserService userService;

    /*@RequestMapping(value = "/login")
    public Result login(@RequestParam String username,String password)throws Exception{
        Account account = userService.login(username, password);
        return Result.successWithData(account);
    }*/

    @RequestMapping(value = "/login")
    public Result login(@RequestParam String username, String password, HttpServletResponse response)throws Exception{
        Account account = userService.login(username, password);
        String token = JwtTokenUtil.createJWT(String.valueOf(account.getId()), account.getUserName(), "admin", audience);
        // 将token放在响应头
        response.setHeader(JwtTokenUtil.AUTH_HEADER_KEY, JwtTokenUtil.TOKEN_PREFIX + token);
        HashMap<String, String> map = new HashMap<>();
        map.put("token", token);
        return Result.successWithData(map);
    }

    @GetMapping("/users")
    public Result userList() {
        System.out.println("查询用户列表。。。。。。");
        return Result.success();
    }
}
