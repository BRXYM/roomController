package edu.neusoft.mapper;
import edu.neusoft.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> getAllUsers();
    User loginUser(int User_id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int user_id);

}
