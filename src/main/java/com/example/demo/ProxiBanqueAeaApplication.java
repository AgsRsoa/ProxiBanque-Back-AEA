package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class ProxiBanqueAeaApplication {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "initDataSet");
		SpringApplication.run(ProxiBanqueAeaApplication.class, args);

	}

}
