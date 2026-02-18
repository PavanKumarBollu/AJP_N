package org.anudip.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component()
public class WishUser {

	static {
		System.out.println("AppConfig .class file is loading");
	}

	public WishUser() {
		System.out.println("AppConfig Constructor got called ...");
	}

	// based on the today time wish the user like good morning or good afternoon or
	// good eveing or good night

	@Autowired
	private LocalDateTime time;

	public void wishUser(String name) {
		System.out.println("WishUser Method Got Called");
		int h = time.getHour();

		if (h <= 12) {
			System.out.println("good morning " + name);
		} else if (h <= 16) {
			System.out.println("good afternoon " + name);
		} else if (h <= 20) {
			System.out.println("good Evening " + name);
		} else if (h <= 24) {
			System.out.println("good night " + name);
		}

	}

}
