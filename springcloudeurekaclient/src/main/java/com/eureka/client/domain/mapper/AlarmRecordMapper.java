package com.eureka.client.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.eureka.client.domain.entity.AlrarmRecord;

@Mapper
public interface AlarmRecordMapper {
    @Select("select isAlarm, alarmTime, alarmType "
          + "from tbl_alarm_status "
          + "where c_ip = #{ip} and substring(insert_time, 1, 13) = #{dateAndHour} "
          + "order by id" )
    List<AlrarmRecord> queryBJStatusByTime(String ip, String dateAndHour);  
    int addBJStatus(AlrarmRecord bJStatus);
    int deleteBJStatus(String ip);
}
