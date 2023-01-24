package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class AdminResult {
    private Integer statusCode;

    private String  code;

    private Object admin;

    private String message;

    public AdminResult(int statusCode, String code , String message) {
        this(statusCode, code,null, message);
    }
}
