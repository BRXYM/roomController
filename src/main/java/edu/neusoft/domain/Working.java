package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Working {
    private int work_id;
    private int work_user_id;
    private int work_classroom_id;
    private int work_waiter_id;
    private Date work_start_time;
    private Date work_end_time;
    private String work_classroom_remark;
}
