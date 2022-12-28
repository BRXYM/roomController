package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classroom {
    private int classroom_id;
    private int classroom_num;
    private String classroom_build;
    private String classroom_room;
    private String classroom_remark;
}
