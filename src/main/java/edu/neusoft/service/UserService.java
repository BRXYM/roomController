package edu.neusoft.service;


import edu.neusoft.domain.User;
import edu.neusoft.utils.UserResult;

public interface UserService {
    UserResult getAllUsers();
    UserResult UserloginService(int user_id, String password);
    UserResult UseraddService(User user);
    UserResult UserupdateService(User user);
    UserResult UserdeleteService(int user_id);
}
