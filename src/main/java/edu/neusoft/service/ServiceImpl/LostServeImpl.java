package edu.neusoft.service.ServiceImpl;

import edu.neusoft.domain.Book;
import edu.neusoft.domain.Lost;
import edu.neusoft.mapper.LostMapper;
import edu.neusoft.service.LostService;
import edu.neusoft.utils.BookResult;
import edu.neusoft.utils.LostResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LostServeImpl implements LostService {
    @Resource
    private LostMapper lostMapper;

    @Override
    public LostResult getAllLost() {
        List<Lost> list = lostMapper.getAllLost();
        System.out.println(list);
        System.out.println("获取所有失物信息");
        return new LostResult(500,"001",list,"获取成功");
    }

    @Override
    public LostResult LostaddService(Lost lost) {
        int line = 0;
        try{
            line = lostMapper.addLost(lost);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("编号重复");
        }
        if(line > 0){
            System.out.println("新增记录"+lost.getLost_id());
            return new LostResult(200,"001",lost,"添加成功");
        }
        return new LostResult(500,"002","添加失败");
    }

    @Override
    public LostResult LostupdateService(Lost lost) {
        int line = lostMapper.updateLost(lost);
        if (line > 0){
            System.out.println("修改成功");
            return new LostResult(200,"001",lost,"修改成功");
        }
        System.out.println("失物不存在");
        return new LostResult(500,"002","修改失败");
    }

    @Override
    public LostResult LostdeleteService(int lost_id) {
        int line = lostMapper.deleteLost(lost_id);
        if (line>0){
            System.out.println(lost_id+"已删除");
            return new LostResult(200,"001","删除成功");
        }
        System.out.println("没有此预约");
        return new LostResult(500,"002","删除失败");
    }


    @Override
    public LostResult getAllLostForUser(int lost_user_id) {
        List<Lost> list = lostMapper.getAllLostForUser(lost_user_id);
        return new LostResult(200,"001",list,"获取成功");
    }

    @Override
    public LostResult getAllLostForTime(String lost_time) {
        lost_time = lost_time+'%';
        List<Lost> list = lostMapper.getAllLostForTime(lost_time);
        return new LostResult(200,"001",list,"获取成功");
    }

    @Override
    public LostResult getAllLostForType(int lost_type) {
        List<Lost> list = lostMapper.getAllLostForType(lost_type);
        return new LostResult(200,"001",list,"获取成功");
    }
}
