package org.anudip.test;

import org.anudip.controller.MainController;
import org.anudip.dto.UserLoginDto;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		MainController controller = context.getBean(MainController.class);

		UserLoginDto dto = new UserLoginDto();
		dto.setUserId("ANp-3637");
		dto.setPassword("1234");
		String result = controller.saveUser(dto);

		System.out.println(result);

		context.close();

	}

}
