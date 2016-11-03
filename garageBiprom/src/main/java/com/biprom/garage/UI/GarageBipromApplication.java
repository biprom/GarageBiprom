package com.biprom.garage.UI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.biprom.garage"})
public class GarageBipromApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarageBipromApplication.class, args);
	}
}
