package com.devops.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * devops-test 시작점
 * @author Woongs
 */
@RestController
@RequestMapping("/devops")
@SpringBootApplication
public class DevopsTestApplication {
	@Value("${userDefine.message}")
	public static String testMsg;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public static String test() {
		String msg = "Hello, Devops test! Rest API works!!"+testMsg;
		return msg;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DevopsTestApplication.class, args);
	}
}
