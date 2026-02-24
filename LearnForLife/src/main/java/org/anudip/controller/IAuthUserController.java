package org.anudip.controller;

import java.util.List;

import org.anudip.dto.AuthUserDTO;
import org.anudip.service.IAuthUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IAuthUserController {
	
	@Autowired
	private IAuthUserServiceImpl service;
	
	
	public String saveUser(AuthUserDTO user)
	{
		return service.saveUser(user);
	}
	
	public List<AuthUserDTO> getAllUsers()
	{
		return service.getAllUsers();
	}
	
	public AuthUserDTO getUserById(Long id)
	{
		return service.getUserById(id);
	}

	public String updateUserById(AuthUserDTO dto)
	{
		return service.updateUserById(dto);
	}
	public String deleteUserById(Long id)
	{
		return service.deleteUserById(id);
	}
	
	public String updateUserPassword(Long id, String password) {
		return service.updateUserPassword(id, password);
	}
	
	public Long countUsers()
	{
		return service.countTheUsers();
	}
	
}
