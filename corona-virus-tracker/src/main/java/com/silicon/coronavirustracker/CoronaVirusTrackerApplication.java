package com.silicon.coronavirustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.silicon.coronavirustracker.services"})
//@EntityScan("com.delivery.domain")
public class CoronaVirusTrackerApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CoronaVirusTrackerApplication.class, args);
	}

}
