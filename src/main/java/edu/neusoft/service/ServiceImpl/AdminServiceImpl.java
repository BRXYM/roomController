package edu.neusoft.service.ServiceImpl;

import edu.neusoft.domain.Admin;
import edu.neusoft.mapper.AdminMapper;
import edu.neusoft.service.AdminService;
import edu.neusoft.utils.AdminResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    @Override
    public AdminResult AdminloginService(int admin_id, String admin_password) {
        Admin admin = adminMapper.loginAdmin(admin_id);
        if (Objects.isNull(admin)){
            System.out.println("管理员不存在");
            return new AdminResult(500,"002","管理员不存在");
        }else {
            if (Objects.equals(admin.getAdmin_password(),admin_password)){
                System.out.println(admin.getAdmin_name()+"登陆成功");
                return new AdminResult(200,"001","登陆成功");
            }else {
                System.out.println(admin.getAdmin_name()+"密码错误");
                return new AdminResult(200,"003",null,"密码错误");
            }
        }
    }

    @Override
    public AdminResult AdminupdateService(Admin admin) {
        int line = adminMapper.Adminupdate(admin);
        if(line > 0 ){
            System.out.println(admin.getAdmin_name()+"修改成功");
            return new AdminResult(200,"001",admin,"修改成功");
        }
        System.out.println("管理员不存在");
        return new AdminResult(500,"002","修改失败");
    }
}
