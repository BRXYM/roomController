package edu.neusoft.controller;

import edu.neusoft.domain.Waiter;
import edu.neusoft.service.WaiterService;
import edu.neusoft.utils.WaiterResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 马延旭
 * 2022年12月23日 06:29:46
 */
@CrossOrigin
@RestController
@RequestMapping("/waiter")
public class WaiterController {

    @Resource
    private WaiterService waiterService;
    //获取服务员信息
    @GetMapping("/getAllWaiters")
    public WaiterResult getAllWaiter(){

        return waiterService.getAllWaiters();
    }
    //用户获取所有服务员
    @GetMapping("/userGetAllWaiter")
    public WaiterResult userGetAllWaiter(){
        return waiterService.userGetAllWaiter();
    }
    //服务员登录
    @PostMapping("/login")
    public WaiterResult loginController(@RequestBody Waiter waiter){
        int waiter_id = waiter.getWaiter_id();
        String password = waiter.getPassword();
        return waiterService.WaiterloginService(waiter_id,password);
    }
    //新增服务员
    @PostMapping("/add")
    public WaiterResult addController(@RequestBody Waiter waiter){

        return waiterService.WaiteraddService(waiter);
    }

    //修改服务员
    @PutMapping("/update")
    public WaiterResult updateController(@RequestBody Waiter waiter){
        return waiterService.WaiterupdateService(waiter);
    }

    //删除服务员
    @DeleteMapping("/delete")
    public WaiterResult deleteController(@RequestParam int waiter_id){
        return waiterService.WaiterdeleteService(waiter_id);
    }

}
