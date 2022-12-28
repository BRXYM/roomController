package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class UserResult {
    private Integer statusCode;

    private String  code;

    private Object user;

    private String message;

    public UserResult(int statusCode, String code , String message) {
        this(statusCode, code,null, message);
    }
}
