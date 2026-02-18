package org.anudip.cfg;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.anudip"})
public class AppConfig {

	static {
		System.out.println("WishUser .class file is loading");
	}

	public AppConfig() {
		System.out.println("WishUser Constructor got called ...");
	}

	@Bean(name = "date")
	public LocalDateTime createTimeObj() {
		return LocalDateTime.now();
	}

}
