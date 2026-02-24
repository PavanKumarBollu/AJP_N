package org.anudip;

import org.anudip.controller.IAuthUserController;
import org.anudip.dto.AuthUserDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnForLifeApplication {

    private final IAuthUserController IAuthUserController;

    LearnForLifeApplication(IAuthUserController IAuthUserController) {
        this.IAuthUserController = IAuthUserController;
    }

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnForLifeApplication.class, args);
		
	
		IAuthUserController controller = context.getBean(IAuthUserController.class);
		
		/*
		 * AuthUserDTO userDto = new AuthUserDTO(); userDto.setLoginId("Anp-3607");
		 * userDto.setPassword("4321"); userDto.setRole("Manager");
		 * userDto.setStatus("Active"); String result = controller.saveUser(userDto);
		 * System.out.println(result);
		 */
		
		
		
		/*
		 * controller.getAllUsers().forEach(user->{System.out.println(user);});
		 */
		
		/*
		 * AuthUserDTO user = controller.getUserById(3l); System.out.println(user);
		 */
		
		/*
		 * AuthUserDTO dto = new AuthUserDTO(); dto.setId(3l);
		 * dto.setLoginId("anp-1234"); dto.setPassword("0987"); dto.setRole("Manager");
		 * dto.setStatus("Blocked");
		 * 
		 * String result = controller.updateUserById(dto); System.out.println(result);
		 */
		
		/*
		 * AuthUserDTO dto = new AuthUserDTO(); dto.setId(3l); dto.setPassword("0000");
		 * 
		 * String result = controller.updateUserById(dto); System.out.println(result);
		 */
		
		/*
		 * String result = controller.deleteUserById(3l); System.out.println(result);
		 */
		
		
		/*
		 * String result = controller.updateUserPassword(4l, "1111");
		 * System.out.println(result);
		 */
		/*O*/
		((ConfigurableApplicationContext) context).close();
	}

}
