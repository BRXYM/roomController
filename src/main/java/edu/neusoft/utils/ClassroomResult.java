package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClassroomResult {
    private Integer statusCode;

    private String  code;

    private Object classroom;

    private String message;

    public ClassroomResult(int statusCode, String code , String message) {
        this(statusCode, code,null, message);
    }

}
