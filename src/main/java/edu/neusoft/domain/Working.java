package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Working {
    private int work_id;
    private int work_user_id;
    private int work_classroom_id;
    private int work_waiter_id;
    private String work_start_time;
    private String work_end_time;
    private String work_classroom_remark;
}
