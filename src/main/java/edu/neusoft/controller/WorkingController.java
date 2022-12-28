package edu.neusoft.controller;

import edu.neusoft.service.WorkingService;
import edu.neusoft.domain.Working;
import edu.neusoft.utils.WorkingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/working")
public class WorkingController {
    @Resource
    private WorkingService workingService;
    //获取所有使用记录
    @GetMapping("/getAllWorking")
    public WorkingResult getAllWorking(){
        return workingService.getAllWorking();
    }
    //增加使用记录
    @GetMapping("/add")
    public WorkingResult addController(@RequestBody Working working){
        return workingService.WorkingaddService(working);
    }
    //修改使用记录
    @PutMapping("update")
    public WorkingResult updateController(@RequestBody Working working){
        return workingService.WorkingupdateService(working);
    }
    //删除使用记录
    @DeleteMapping("/delete")
    public WorkingResult deleteController(@RequestParam int work_id){
        return workingService.WorkingdeleteService(work_id);
    }
    //根据用户ID获取使用记录
    @GetMapping("/getworkingforuser")
    public WorkingResult getAllWorkingForUser(@RequestParam int work_user_id){
        return workingService.getAllWorkingForUser(work_user_id);
    }
    //根据服务员ID获取使用记录
    @GetMapping("/getworkingforwaiter")
    public WorkingResult getAllWorkingForWaiter(@RequestParam int work_waiter_id){
        return workingService.getAllWorkingForWaiter(work_waiter_id);
    }
    //根据教室ID获取的使用记录
    @GetMapping("/getworkingforclassroom")
    public WorkingResult getAllWorkingForClassroom(@RequestParam int work_classroom_id){
        return workingService.getAllWorkingForClassroom(work_classroom_id);
    }
}
