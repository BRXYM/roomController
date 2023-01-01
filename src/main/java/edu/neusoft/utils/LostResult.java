package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LostResult {
    private Integer statusCode;

    private String  code;

    private Object lost;

    private String message;

    public LostResult(int statusCode, String code , String message) {
        this(statusCode, code,null, message);
    }

}
