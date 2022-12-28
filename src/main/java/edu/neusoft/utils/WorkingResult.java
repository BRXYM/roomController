package edu.neusoft.utils;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

//@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
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
