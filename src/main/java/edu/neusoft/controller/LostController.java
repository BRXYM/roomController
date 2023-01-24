package edu.neusoft.controller;

import edu.neusoft.domain.Lost;
import edu.neusoft.service.LostService;
import edu.neusoft.utils.LostResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/lost")
public class LostController {
    @Resource
    private LostService lostService;
    //获取所有失物记录
    @GetMapping("/getAllLost")
    public LostResult getAllLost(){
        return lostService.getAllLost();
    }
    //增加遗失物品
    @PostMapping("/add")
    public LostResult addController(@RequestBody Lost lost){
        return lostService.LostaddService(lost);
    }
    //修改遗失物品
    @GetMapping("/update")
    public LostResult updateController(@RequestBody Lost lost){
        return lostService.LostupdateService(lost);
    }
    //删除遗失物品
    @DeleteMapping("/delete")
    public LostResult deleteController(@RequestParam int lost_id){
        return lostService.LostdeleteService(lost_id);
    }
    //根据用户ID查询遗失物品
    @GetMapping("/getlostforuser")
    public LostResult getAllLostForUser(@RequestParam int lost_user_id){
        return lostService.getAllLostForUser(lost_user_id);
    }
    //根据时间查询遗失物品
    @GetMapping("/getlostfortime")
    public LostResult getAllLostForTime(@RequestParam String lost_time){
        return lostService.getAllLostForTime(lost_time);
    }
    //根据类型查询遗失物品
    @GetMapping("/getlostfortype")
    public LostResult getAllLostForType(@RequestParam int lost_type){
        return lostService.getAllLostForType(lost_type);
    }
}
