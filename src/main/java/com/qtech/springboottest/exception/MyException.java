package com.qtech.springboottest.exception;

/**
 * @Description: ${description}
 * @Date: 2019/10/14 17:22
 * @Version: 1.0
 */
public class MyException extends Exception {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
