package com.snapdeal.qaas.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.snapdeal.qaas.dao.IUserDAO;

public class UserDAO implements IUserDAO
{
	@Override
	public Integer fetchUserIdByUserName(String userName)
	{
		Integer userId = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qcaas","root","snapdeal");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user_roles where username = "+ userName);
			while(rs.next())
			{
				userId = rs.getInt(5);
			}
			con.close();
			return userId;
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
