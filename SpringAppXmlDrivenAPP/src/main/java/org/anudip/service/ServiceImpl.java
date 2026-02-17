package org.anudip.service;

import org.anudip.bo.UserLoginBo;
import org.anudip.dao.UserDao;
import org.anudip.dto.UserLoginDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {
	
	@Autowired
	private UserDao dao;
	static
	{
		System.out.println("ServiceImpl .class file is loaded..");
	}
	
	
	public ServiceImpl()
	{
		System.out.println("ServiceImpl Object has been created");
	}

	public String saveUser(UserLoginDto dto)
	{
		UserLoginBo bo = new UserLoginBo();
		
		
		// when dto and bo object have common properties with same datatypes we can do the following
		
		BeanUtils.copyProperties(dto, bo);
		Integer result = dao.saveUser(bo);
		
		
		return result == 0 ? "User Deatils has not saved " : " User Details Saved";
	}
	
	
}
