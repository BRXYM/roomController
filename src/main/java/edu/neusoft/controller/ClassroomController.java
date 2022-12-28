package edu.neusoft.controller;

import edu.neusoft.domain.Classroom;
import edu.neusoft.service.ClassroomService;
import edu.neusoft.utils.ClassroomResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/classrooms")
public class ClassroomController {
    @Resource
    private ClassroomService classroomService;
//获取所有教室
    @GetMapping("/getAllClassrooms")
    public ClassroomResult getAllClassroom(){
        return classroomService.getAllClassrooms();
    }
    //增加教室
    @GetMapping("/add")
    public ClassroomResult addController(@RequestBody Classroom classroom){
        return classroomService.ClassroomaddService(classroom);
    }
    //修改教室
    @PutMapping("/update")
    public ClassroomResult updateController(@RequestBody Classroom classroom){
        return classroomService.ClassroomupdateService(classroom);
    }
    //删除教室
    @DeleteMapping("/delete")
    public ClassroomResult deleteController(@RequestParam int classroom_id){
        return classroomService.ClassroomdeleteService(classroom_id);
    }
}
