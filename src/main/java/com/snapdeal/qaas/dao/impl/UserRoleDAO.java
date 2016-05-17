package com.snapdeal.qaas.dao.impl;

import com.snapdeal.qaas.dao.IUserRoleDAO;
import com.snapdeal.qaas.entity.UserRole;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class UserRoleDAO implements IUserRoleDAO
{
	@Override
	public UserRole fetchUserRoleByUserId(Integer id)
	{
		UserRole ur = new UserRole();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qcaas","root","snapdeal");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user_roles where user_id = "+ id);
			while(rs.next())
			{
				ur.setUserId(rs.getInt(2));
				ur.setId(rs.getInt(1));
				String roles = rs.getString(3);
				ArrayList<String> rolesList = (ArrayList<String>)Arrays.asList(roles.split(","));
				ur.setRoles(rolesList);
			}
			con.close();
			return ur;
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
