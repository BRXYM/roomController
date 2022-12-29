package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lost {
    private int lost_id;
    private int lost_user_id;
    private String lost_infor;
    private String lost_remark;
}
