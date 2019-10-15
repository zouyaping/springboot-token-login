package com.qtech.springboottest.entity;

import org.springframework.stereotype.Component;

/**
 * @Description: ${description}
 * @Date: 2019/10/14 15:38
 * @Version: 1.0
 */
@Component
public class Account {
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
