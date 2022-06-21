package com.example.greeting.api;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/live-check")
	public String liveCheck() throws Exception {
		LOGGER.info("Greeting:: liveCheck");
		return "Greeting:: " + new Date();
	}
	
	@GetMapping("/test-param")
	public String testParam(@RequestParam(defaultValue = "server.port") String param) throws Exception {
		String ret = environment.getProperty(param);
		return ret; 
	}
}
