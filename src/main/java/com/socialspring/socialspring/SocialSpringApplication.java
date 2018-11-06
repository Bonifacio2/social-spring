package com.socialspring.socialspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@SpringBootApplication
public class SocialSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialSpringApplication.class, args);
	}

//	@Bean
//	HiddenHttpMethodFilter hiddenHttpMethodFilter() {
//		return new HiddenHttpMethodFilter();
//	}
}
