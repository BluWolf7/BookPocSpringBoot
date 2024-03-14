package com.secretmanagerpocv2.secretmanagerpocv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class Secretmanagerpocv2Application {

	public static void main(String[] args) {
		SpringApplication.run(Secretmanagerpocv2Application.class, args);
	}

}
