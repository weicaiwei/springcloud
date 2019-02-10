package com.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableHystrix
@EnableHystrixDashboard
@EnableEurekaClient
@EnableTurbine
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

