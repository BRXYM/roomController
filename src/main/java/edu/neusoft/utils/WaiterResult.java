package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class WaiterResult {
    private Integer statusCode;

    private String  code;

    private Object waiter;

    private String message;

    public WaiterResult(int statusCode, String code , String message) {
        this(statusCode, code,null, message);
    }
}
