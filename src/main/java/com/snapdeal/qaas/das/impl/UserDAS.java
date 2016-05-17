package com.snapdeal.qaas.das.impl;

import com.snapdeal.qaas.dao.IUserDAO;
import com.snapdeal.qaas.das.IUserDAS;

public class UserDAS implements IUserDAS
{
	IUserDAO userDao;
	
	@Override
	public Integer fetchUserIdByUserName(String userName)
	{
		return userDao.fetchUserIdByUserName(userName);
	}

}
