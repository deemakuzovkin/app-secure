package com.secure.appsecure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"file:application.properties"})
public class AppSecureApplication {
	public static void main(String[] args) {
		SpringApplication.run(AppSecureApplication.class, args);
	}
}
