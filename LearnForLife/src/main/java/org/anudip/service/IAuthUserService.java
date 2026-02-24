package org.anudip.service;

import java.util.List;

import org.anudip.dto.AuthUserDTO;

public interface IAuthUserService {
	
	public String saveUser(AuthUserDTO user);
	public List<AuthUserDTO> getAllUsers();
	public AuthUserDTO getUserById(Long id);
	public String updateUserById( AuthUserDTO dto);
	
	public String deleteUserById(Long id);
	
	
	
	// special cases with respect to the AuthUser Table
	
	public String updateUserPassword(Long id, String password);
	
	// Count to the total number of users in the database
	
	public Long countTheUsers();
	

}
