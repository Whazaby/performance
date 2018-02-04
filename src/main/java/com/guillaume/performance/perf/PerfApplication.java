package com.guillaume.performance.perf;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PerfApplication {

	private static final Logger log = LogManager.getLogger(PerfApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PerfApplication.class, args);
	}
}