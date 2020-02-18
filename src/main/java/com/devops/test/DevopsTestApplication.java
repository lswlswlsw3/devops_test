package com.devops.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devops.test.config.TestConfiguration;

/**
 * devops-test 시작점
 * @author Woongs
 */
@SpringBootApplication
public class DevopsTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(DevopsTestApplication.class, args);
	}
}
