package com.manoj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class ProfileDemoApplication {


	private static final Logger LOGGER = LoggerFactory.getLogger(ProfileDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProfileDemoApplication.class, args);

	}

}
