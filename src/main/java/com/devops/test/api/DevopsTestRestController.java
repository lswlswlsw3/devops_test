package com.devops.test.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devops.test.config.TestConfiguration;

/**
 * devops restcontroller
 * @author Woongs
 */
@RestController
@RequestMapping("/devops")
public class DevopsTestRestController {
	@Autowired
	TestConfiguration testConfiguration;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		String msg = "Hello, Devops test! Rest API works!! : "+testConfiguration.getMessage();
		return msg;
	}
}
