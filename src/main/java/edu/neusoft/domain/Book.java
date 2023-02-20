package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.PrimitiveIterator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int book_id;
    private int book_user_id;
    private int book_classroom_id;
    private int book_waiter_id;
    private String audit;
    private Date book_start_time;
    private Date book_end_time;
}
