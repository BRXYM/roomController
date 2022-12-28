package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Waiter {
    private int waiter_id;
    private String password;
    private String waiter_phone;
    private String waiter_email;
    private String waiter_name;
}
