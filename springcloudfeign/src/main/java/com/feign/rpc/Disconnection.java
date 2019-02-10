package com.feign.rpc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.feign.vo.AlarmRecord;

@Service
public class Disconnection implements ScheduleAlarmRecordService {

    @Override
    public List<AlarmRecord> queryBJStatusByTime(String ip, String date, String hour) {
        return new ArrayList<AlarmRecord>();
    }

}
