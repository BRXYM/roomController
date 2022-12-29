package edu.neusoft.controller;

import edu.neusoft.service.LostService;
import edu.neusoft.utils.LostResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
