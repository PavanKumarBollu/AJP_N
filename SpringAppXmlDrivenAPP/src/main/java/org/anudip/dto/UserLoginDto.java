package org.anudip.dto;

public class UserLoginDto{

	private String UserId;
	private String password;
	
	static
	{
		System.out.println("UserLoginDto .class file is loaded..");
	}
	
	
	public UserLoginDto()
	{
		System.out.println("UserLoginDto Object has been created");
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserLoginBo [UserId=" + UserId + ", password=" + password + "]";
	}

}
