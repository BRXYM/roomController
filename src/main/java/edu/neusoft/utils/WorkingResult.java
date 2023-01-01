package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WorkingResult {
    private Integer statusCode;

    private String  code;

    private Object Working;

    private String message;

    public WorkingResult(int statusCode, String code , String message) {
        this(statusCode, code,null, message);
    }

}
