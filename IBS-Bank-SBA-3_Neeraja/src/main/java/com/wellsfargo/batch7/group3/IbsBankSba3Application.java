package com.wellsfargo.batch7.group3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.wellsfargo.batch7.group3"})
@SpringBootApplication
public class IbsBankSba3Application {

	public static void main(String[] args) {
		SpringApplication.run(IbsBankSba3Application.class, args);
	}

}
