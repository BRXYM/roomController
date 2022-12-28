package edu.neusoft.controller;

import edu.neusoft.domain.User;
import edu.neusoft.service.UserService;
import edu.neusoft.utils.UserResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 马延旭
 * 2022年12月22日 23:54:43
 */
@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserService userService;
    //获取用户信息
    @GetMapping("/getAllUsers")
    public UserResult getAllUser(){
        return userService.getAllUsers();
    }
    //用户登录
    @PostMapping("/login")
    public UserResult loginController(@RequestBody User user){
        int user_id = user.getUser_id();
        String password = user.getPassword();
        return userService.UserloginService(user_id,password);
    }
    //新增用户
    @PostMapping("/add")
    public UserResult addController(@RequestBody User user){

        return userService.UseraddService(user);
    }

    //修改用户
    @PutMapping("/update")
    public UserResult updateController(@RequestBody User user){
        return userService.UserupdateService(user);
    }

    //删除用户
    @DeleteMapping("/delete")
    public UserResult deleteController(@RequestParam int user_id){
        return userService.UserdeleteService(user_id);
    }

}
