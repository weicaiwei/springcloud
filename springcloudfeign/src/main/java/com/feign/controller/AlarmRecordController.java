package com.feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.rpc.ScheduleAlarmRecordService;
import com.feign.util.JsonUtil;
import com.feign.util.Result;
import com.feign.vo.AlarmRecord;

@RestController

public class AlarmRecordController {
    
    @Autowired
    ScheduleAlarmRecordService scheduleAlarmRecordService;

    @RequestMapping(value="/record/{ip}/{date}/{hour}")
    public Result queryBJStatusByTime(@PathVariable("ip") String ip, @PathVariable("date") String date, @PathVariable("hour") String hour) {
        List<AlarmRecord> alarmRecordList = scheduleAlarmRecordService.queryBJStatusByTime(ip, date, hour);
        if (alarmRecordList.size() > 0) {
            return JsonUtil.success(alarmRecordList);
        }else {
            return JsonUtil.fail("查询的数据不存在");
        }
        
        
    }
}
