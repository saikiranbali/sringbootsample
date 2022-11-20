package com.example.nanitesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NanitestingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(NanitestingApplication.class, args);
//		Alien a =context.getBean(Alien.class);
		Alien b = context.getBean(Alien.class);
//		a.setAid(3);
//		System.out.println(a.getAid());
//		a.show();
		b.show();
	}

}