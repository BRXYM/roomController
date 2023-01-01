package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookResult {
    private Integer statusCode;

    private String  code;

    private Object book;

    private String message;

    public BookResult(int statusCode, String code , String message) {
        this(statusCode, code,null, message);
    }

}
