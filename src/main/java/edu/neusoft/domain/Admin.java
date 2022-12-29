package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private int admin_id;
    private String admin_password;
    private String admin_name;
    private String admin_phone;

}
