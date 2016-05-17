package com.snapdeal.qaas.das.impl;

import com.snapdeal.qaas.dao.IUserRoleDAO;
import com.snapdeal.qaas.das.IUserRoleDAS;
import com.snapdeal.qaas.entity.UserRole;


public class UserRoleDAS implements IUserRoleDAS
{
	IUserRoleDAO userRoleDao;
	
	@Override
	public UserRole fetchUserRoleByUserId(Integer id)
	{
		return userRoleDao.fetchUserRoleByUserId(id);
	}
}
