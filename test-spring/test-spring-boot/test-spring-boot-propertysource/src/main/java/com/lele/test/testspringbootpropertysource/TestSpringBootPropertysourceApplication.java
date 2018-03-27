package com.lele.test.testspringbootpropertysource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringBootPropertysourceApplication {

	private static final Logger log = LoggerFactory.getLogger(TestSpringBootPropertysourceApplication.class);

	public static void main(String[] args) {
	    log.info("=======================  spring boot start ======================");
		SpringApplication.run(TestSpringBootPropertysourceApplication.class, args);
	}
}
