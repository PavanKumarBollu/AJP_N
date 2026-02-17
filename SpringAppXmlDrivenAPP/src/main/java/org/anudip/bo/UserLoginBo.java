package org.anudip.bo;

public class UserLoginBo {

	private String UserId;
	private String password;
	
	
	static
	{
		System.out.println("UserLoginBo .class file is loaded..");
	}
	
	
	public UserLoginBo()
	{
		System.out.println("UserLoginBO Object has been created");
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
