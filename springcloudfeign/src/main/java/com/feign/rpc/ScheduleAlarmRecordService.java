package com.feign.rpc;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.feign.vo.AlarmRecord;

@FeignClient(value="service-alarm-record",fallback = Disconnection.class)
public interface ScheduleAlarmRecordService {
    @RequestMapping(value="/record/{ip}/{date}/{hour}")
    public List<AlarmRecord> queryBJStatusByTime(@PathVariable("ip") String ip, @PathVariable("date") String date, @PathVariable("hour") String hour);
}
