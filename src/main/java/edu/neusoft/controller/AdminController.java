package edu.neusoft.controller;

import edu.neusoft.domain.Admin;
import edu.neusoft.service.AdminService;
import edu.neusoft.utils.AdminResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;
    @PostMapping("/login")
    public AdminResult loginController(@RequestBody Admin admin){
        int admin_id = admin.getAdmin_id();
        String admin_password = admin.getAdmin_password();
        return adminService.AdminloginService(admin_id,admin_password);
    }
    @PutMapping("/update")
    public AdminResult updateController(@RequestBody Admin admin){
        return adminService.AdminupdateService(admin);
    }
    @GetMapping("/getAllAdmin")
    public AdminResult getAllAdmin(){
        return adminService.getAllAdmin();
    }
}
