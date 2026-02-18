package org.anudip.test;

import org.anudip.cfg.AppConfig;
import org.anudip.comp.WishUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestSpring {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		WishUser user = context.getBean(WishUser.class);
		
		user.wishUser("Pavan");
		
		System.out.println();
		
		((AbstractApplicationContext) context).close();
		
	}

}
