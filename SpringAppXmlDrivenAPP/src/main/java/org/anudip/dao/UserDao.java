package org.anudip.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.anudip.bo.UserLoginBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	private DataSource datsource;
	
	
	static
	{
		System.out.println("UserDao .class file is loaded..");
	}
	
	
	public UserDao()
	{
		System.out.println("UserDao Object has been created");
	}
	

	private static final String INSERT_USER_QUERY = "insert into user_login(user_id, password) value(?,?)";

	public Integer saveUser(UserLoginBo bo) {
		try (Connection connection = datsource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(INSERT_USER_QUERY)) {

			pstmt.setString(1, bo.getUserId());
			pstmt.setString(2, bo.getPassword());

			int result = pstmt.executeUpdate();
			return result;

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
