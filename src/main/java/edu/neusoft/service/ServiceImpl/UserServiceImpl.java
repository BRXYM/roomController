package edu.neusoft.service.ServiceImpl;

import edu.neusoft.domain.User;
import edu.neusoft.mapper.UserMapper;
import edu.neusoft.service.UserService;
import edu.neusoft.utils.UserResult;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    //获取用户信息
    @Override
    public UserResult getAllUsers() {
        List<User> list = userMapper.getAllUsers();
        System.out.println("获取所有用户信息");
        return new UserResult(200,"001",list,"获取成功");
    }
    //用户登录
    @Override
    public UserResult UserloginService(int user_id, String password) {
        User user = userMapper.loginUser(user_id);
        if(Objects.isNull(user)){
            System.out.println("用户不存在");
            return new UserResult(500,"002","用户不存在");
        }else {
            if (Objects.equals(user.getPassword(), password)){
                System.out.println(user.getUser_name()+"登录成功");
                return new UserResult(200,"001",user,"登录成功");
            }else {
                System.out.println(user.getUser_name()+"密码错误");
                return new UserResult(200,"003",null,"密码错误");
            }
        }
    }
    //增加用户
    @Override
    @ResponseStatus
    public UserResult UseraddService(User user) {
        int line = 0;
        try {
            line = userMapper.addUser(user);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("用户已存在");
        }
        if (line > 0) {
            System.out.println("新增用户"+user.getUser_name());
            return new UserResult(200, "001", user, "添加成功");
        }
        return new UserResult(500, "002", "添加失败");
    }
    //修改用户
    @Override
    public UserResult UserupdateService(User user) {
        int line = userMapper.updateUser(user);
        if (line > 0) {
            System.out.println(user.getUser_name()+"修改成功");
            return new UserResult(200, "001", user, "修改成功");
        }
        System.out.println("用户不存在");
        return new UserResult(500, "002", "修改失败");
    }
    //删除用户
    @Override
    public UserResult UserdeleteService(int user_id) {
        int line = userMapper.deleteUser(user_id);
        if (line > 0) {
            System.out.println(user_id+"已删除");
            return new UserResult(200,"001","删除成功");
        }else {
            System.out.println("用户不存在");
            return new UserResult(500,"002","删除失败");
        }
    }
}
