package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.PrimitiveIterator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int book_id;
    private int book_user_id;
    private int book_classroom_id;
    private int book_waiter_id;
    private int audit;
    private String book_start_time;
    private String book_end_time;
}
