package com.qtech.springboottest.exception;

/**
 * @Description: 自定义异常
 * @Date: 2019/10/14 18:31
 * @Version: 1.0
 */
public class CustomException extends Exception {
    private int code;

    public CustomException(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
