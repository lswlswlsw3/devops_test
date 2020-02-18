package com.devops.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {
	@Value("${userDefine.message}")
	private String message;

	public String getMessage() {
		return message;
	}
}
