package com.corp.esaa.bankAcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class BankAccApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAccApplication.class, args);
	}

}
