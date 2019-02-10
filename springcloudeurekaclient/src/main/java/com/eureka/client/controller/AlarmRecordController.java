package com.eureka.client.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.domain.entity.AlrarmRecord;
import com.eureka.client.domain.mapper.AlarmRecordMapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@EnableHystrixDashboard
public class AlarmRecordController {

    @Autowired
    AlarmRecordMapper alarmRecordMapper;
    
    @RequestMapping("/record/{ip}/{date}/{hour}")
    @HystrixCommand(fallbackMethod = "queryBJStatusByTimeError")
    public List<AlrarmRecord> queryBJStatusByTime(@PathVariable("ip") String ip, @PathVariable("date") String date, @PathVariable("hour") String hour) {
        return alarmRecordMapper.queryBJStatusByTime(ip, date+" "+hour);
        
    }
    public List<AlrarmRecord> queryBJStatusByTimeError(String ip, String date, String hour) {
        return new ArrayList<AlrarmRecord>();
        
    }
}
