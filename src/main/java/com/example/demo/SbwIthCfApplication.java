package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.example.controller","com.example.config"})
public class SbwIthCfApplication extends org.springframework.boot.web.support.SpringBootServletInitializer  {
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SbwIthCfApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SbwIthCfApplication.class, args);
	}

}

