package edu.neusoft.service.ServiceImpl;

import edu.neusoft.domain.Lost;
import edu.neusoft.mapper.LostMapper;
import edu.neusoft.service.LostService;
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
        return null;
    }

    @Override
    public LostResult Lostupdate(Lost lost) {
        return null;
    }

    @Override
    public LostResult Lostdelete(int lost_id) {
        return null;
    }

    @Override
    public LostResult getAllLostForUser(int lost_user_id) {
        return null;
    }
}
