package edu.neusoft.service.ServiceImpl;

import edu.neusoft.domain.Working;
import edu.neusoft.mapper.WorkingMapper;
import edu.neusoft.service.WorkingService;
import edu.neusoft.utils.WorkingResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorkingServiceImpl implements WorkingService {
    @Resource
    private WorkingMapper workingMapper;
    @Override
    public WorkingResult getAllWorking() {
        List<Working> list = workingMapper.getAllWorking();
        System.out.println(list);
        System.out.println("获取所有使用记录");
        return new WorkingResult(500,"001",list,"获取成功");
    }

    @Override
    public WorkingResult WorkingaddService(Working working) {
        int line = 0;
        try {
            line = workingMapper.addWorking(working);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("编号重复");
        }
        if(line>0){
            System.out.println("新增记录"+working.getWork_id());
            return new WorkingResult(200,"001",working,"添加成功");
        }
        return new WorkingResult(500,"002","添加失败");
    }
    //修改使用记录
    @Override
    public WorkingResult WorkingupdateService(Working working) {
        int line = workingMapper.updateWorking(working);
        if(line>0){
            System.out.println(working.getWork_id()+"修改成功");
            return new WorkingResult(200,"001",working,"修改成功");
        }
        System.out.println("教室不存在");
        return new WorkingResult(500,"002","修改失败");
    }

    @Override
    public WorkingResult WorkingdeleteService(int work_id) {
        int line = workingMapper.deleteWorking(work_id);
        if (line>0){
            System.out.println(work_id+"已删除");
            return new WorkingResult(200,"001","删除成功");
        }
        System.out.println("没有此记录");
        return new WorkingResult(500,"002","删除失败");
    }
//根据用户查询记录
    @Override
    public WorkingResult getAllWorkingForUser(int work_user_id) {
        List<Working> list =  workingMapper.getAllWorkingForUser(work_user_id);
        return new WorkingResult(200,"001",list,"获取成功");
    }
//根据服务员查询记录
    @Override
    public WorkingResult getAllWorkingForWaiter(int work_waiter_id) {
        List<Working> list =  workingMapper.getAllWorkingForWaiter(work_waiter_id);
        return new WorkingResult(200,"001",list,"获取成功");
    }
//根据教室查询记录
    @Override
    public WorkingResult getAllWorkingForClassroom(int work_classroom_id) {
        List<Working> list =  workingMapper.getAllWorkingForClassroom(work_classroom_id);
        return new WorkingResult(200,"001",list,"获取成功");
    }
}
