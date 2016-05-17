package com.snapdeal.qaas.entity;

import java.util.ArrayList;

/**
 * @author justine
 *
 */
public class UserRole
{
	private Integer id;
	private Integer userId;
	private ArrayList<String> roles;
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getUserId()
	{
		return userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	public ArrayList<String> getRoles()
	{
		return roles;
	}
	public void setRoles(ArrayList<String> roles)
	{
		this.roles = roles;
	}
	
	
	
	
	
}
