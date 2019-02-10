package com.eureka.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.eureka.client.domain.mapper.AlarmRecordMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudeurekaclientApplicationTests {

    @Autowired
    AlarmRecordMapper alarmRecordMapper;
	@Test
	public void contextLoads() {
	    alarmRecordMapper.queryBJStatusByTime("11", "S14");
	}

}

