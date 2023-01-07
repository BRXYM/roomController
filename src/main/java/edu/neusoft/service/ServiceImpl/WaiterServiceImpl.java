package edu.neusoft.service.ServiceImpl;

import edu.neusoft.domain.Waiter;
import edu.neusoft.mapper.WaiterMapper;
import edu.neusoft.service.WaiterService;
import edu.neusoft.utils.WaiterResult;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
public class WaiterServiceImpl implements WaiterService {
    @Resource
    private WaiterMapper waiterMapper;
    //获取用户信息
    @Override
    public WaiterResult getAllWaiters() {
        List<Waiter> list = waiterMapper.getAllWaiters();
        System.out.println("获取所有服务员信息");
        return new WaiterResult(200,"001",list,"获取成功");
    }

    @Override
    public WaiterResult userGetAllWaiter() {
        List<Waiter> list = waiterMapper.userGetAllWaiters();
        System.out.println("获取所有服务员信息");
        return new WaiterResult(200,"001",list,"获取成功");
    }

    //用户登录
    @Override
    public WaiterResult WaiterloginService(int waiter_id, String password) {
        Waiter waiter = waiterMapper.loginWaiter(waiter_id);
        if(Objects.isNull(waiter)){
            System.out.println("用户不存在");
            return new WaiterResult(500,"002","服务员不存在");
        }else {
            if (Objects.equals(waiter.getPassword(), password)){
                System.out.println("服务员"+waiter.getWaiter_name()+"登录成功");
                return new WaiterResult(200,"001",waiter,"登录成功");
            }else {
                System.out.println(waiter.getWaiter_name()+"密码错误");
                return new WaiterResult(200,"003",null,"密码错误");
            }
        }
    }
    //增加用户
    @Override
    @ResponseStatus
    public WaiterResult WaiteraddService(Waiter waiter) {
        int line = 0;
        try {
            line = waiterMapper.addWaiter(waiter);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("服务员已存在");
        }
        if (line > 0) {
            System.out.println("新增服务员"+waiter.getWaiter_name());
            return new WaiterResult(200, "001", waiter, "添加成功");
        }
        return new WaiterResult(500, "002", "添加失败");
    }
    //修改用户
    @Override
    public WaiterResult WaiterupdateService(Waiter waiter) {
        int line = waiterMapper.updateWaiter(waiter);
        if (line > 0) {
            System.out.println(waiter.getWaiter_name()+"修改成功");
            return new WaiterResult(200, "001", waiter, "修改成功");
        }
        System.out.println("服务员不存在");
        return new WaiterResult(500, "002", "修改失败");
    }
    //删除用户
    @Override
    public WaiterResult WaiterdeleteService(int waiter_id) {
        int line = waiterMapper.deleteWaiter(waiter_id);
        if (line > 0) {
            System.out.println(waiter_id+"已删除");
            return new WaiterResult(200,"001","删除成功");
        }else {
            System.out.println("服务员不存在");
            return new WaiterResult(500,"002","删除失败");
        }

    }
}
