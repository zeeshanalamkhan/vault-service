package com.zeeshan.vault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@PropertySource("classpath:bootstrap.properties")
public class VaultServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaultServiceApplication.class, args);
	}

}
