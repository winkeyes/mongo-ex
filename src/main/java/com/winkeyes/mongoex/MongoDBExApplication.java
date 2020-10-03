package com.winkeyes.mongoex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
@SpringBootApplication
public class MongoDBExApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDBExApplication.class, args);
	}

}
