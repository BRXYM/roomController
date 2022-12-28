package edu.neusoft.service.ServiceImpl;

import edu.neusoft.domain.Classroom;
import edu.neusoft.mapper.ClassroomMapper;
import edu.neusoft.service.ClassroomService;
import edu.neusoft.utils.ClassroomResult;
import edu.neusoft.utils.WaiterResult;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    @Resource
    private ClassroomMapper classroomMapper;
    //获取所有教室信息
    @Override
    public ClassroomResult getAllClassrooms() {
        List<Classroom> list = classroomMapper.getAllClassrooms();

        System.out.println("获取所有教室信息");
        return new ClassroomResult(500,"001",list,"获取成功");
    }


    @Override
    @ResponseStatus
    public ClassroomResult ClassroomaddService(Classroom classroom) {
        int line = 0;
        try {
            line = classroomMapper.addClassroom(classroom);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("教室已存在");
        }
        if (line>0){
            System.out.println("新增教室"+classroom.getClassroom_id());
            return new ClassroomResult(200,"001",classroom,"添加成功");
        }
        return new ClassroomResult(500,"002",classroom,"添加失败");
    }
//修改教室
    @Override
    public ClassroomResult ClassroomupdateService(Classroom classroom) {
        int line = classroomMapper.updateClassroom(classroom);
        if(line>0){
            System.out.println(classroom.getClassroom_id()+"修改成功");
            return new ClassroomResult(200,"001",classroom,"修改成功");
        }
        System.out.println("教室不存在");
        return new ClassroomResult(500,"002","修改失败");
    }

    @Override
    public ClassroomResult ClassroomdeleteService(int classroom_id) {
        int line = classroomMapper.deleteClassroom(classroom_id);
        if(line > 0){
            System.out.println(classroom_id+"已删除");
            return new ClassroomResult(200,"001","删除成功");
        }
        System.out.println("没有此教室");
        return new ClassroomResult(500,"002","删除失败");
    }

}
