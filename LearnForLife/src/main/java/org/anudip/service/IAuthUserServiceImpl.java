package org.anudip.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.anudip.bo.AuthUserBO;
import org.anudip.dto.AuthUserDTO;
import org.anudip.repository.IAuthUserRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IAuthUserServiceImpl implements IAuthUserService {

	@Autowired
	private IAuthUserRepo repo;

	@Override
	public String saveUser(AuthUserDTO user) {
		// convert the dto into bo
		AuthUserBO bo = new AuthUserBO();
		BeanUtils.copyProperties(user, bo);
		AuthUserBO savedUser = repo.save(bo);
		return savedUser != null ? "user saved to the database with id : " + savedUser.getId()
				: "Failed to Save the user to the database";
	}

	@Override
	public List<AuthUserDTO> getAllUsers() {
		
		Iterable<AuthUserBO> users = repo.findAll();
		List<AuthUserDTO> list = new ArrayList<AuthUserDTO>();
		users.forEach(user-> {
			AuthUserDTO dto = new AuthUserDTO();
			BeanUtils.copyProperties(user, dto);
			list.add(dto);
		});
		
		return list;
	}

	@Override
	public AuthUserDTO getUserById(Long id) {
		Optional<AuthUserBO> byId = repo.findById(id);
		AuthUserDTO dto = new AuthUserDTO();
		if(byId.isPresent())
		{
			BeanUtils.copyProperties(byId.get(), dto);
		}
		return dto;
	}

	@Override
	public String updateUserById(AuthUserDTO dto) {
		AuthUserDTO isAvailable = getUserById(dto.getId());
		AuthUserBO save = null;
		if(isAvailable != null)
		{
			AuthUserBO bo = new AuthUserBO();
			BeanUtils.copyProperties(dto, bo);
			save = repo.save(bo);
		}
		
		return save != null ?"User Details Updated " :"User is not updated" ;
	}

	@Override
	public String deleteUserById(Long id) {
		Optional<AuthUserBO> byId = repo.findById(id);
		if(byId.isPresent())
		{
			repo.deleteById(id);
		}
		Optional<AuthUserBO> byId2 = repo.findById(id);
		if(!byId2.isPresent())
		{
			return "User Deleted Form the Database";
		}else
		return "User not Deleted ";
	}

	@Override
	public String updateUserPassword(Long id, String password) {
		
		Optional<AuthUserBO> byId = repo.findById(id);
		if(byId.isPresent())
		{
			AuthUserBO userBO = byId.get();
			
			userBO.setPassword(password);
			repo.save(userBO);
			return "Password is updated Successfully";
		}
		
		return "Password Is Not Updated Successfully";
	}

	@Override
	public Long countTheUsers() {
		return repo.count();
	}

}
