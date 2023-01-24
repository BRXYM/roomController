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
    //��ȡ����ʧ���¼
    @GetMapping("/getAllLost")
    public LostResult getAllLost(){
        return lostService.getAllLost();
    }
    //������ʧ��Ʒ
    @PostMapping("/add")
    public LostResult addController(@RequestBody Lost lost){
        return lostService.LostaddService(lost);
    }
    //�޸���ʧ��Ʒ
    @GetMapping("/update")
    public LostResult updateController(@RequestBody Lost lost){
        return lostService.LostupdateService(lost);
    }
    //ɾ����ʧ��Ʒ
    @DeleteMapping("/delete")
    public LostResult deleteController(@RequestParam int lost_id){
        return lostService.LostdeleteService(lost_id);
    }
    //�����û�ID��ѯ��ʧ��Ʒ
    @GetMapping("/getlostforuser")
    public LostResult getAllLostForUser(@RequestParam int lost_user_id){
        return lostService.getAllLostForUser(lost_user_id);
    }
    //����ʱ���ѯ��ʧ��Ʒ
    @GetMapping("/getlostfortime")
    public LostResult getAllLostForTime(@RequestParam String lost_time){
        return lostService.getAllLostForTime(lost_time);
    }
    //�������Ͳ�ѯ��ʧ��Ʒ
    @GetMapping("/getlostfortype")
    public LostResult getAllLostForType(@RequestParam int lost_type){
        return lostService.getAllLostForType(lost_type);
    }
}
