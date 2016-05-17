package com.snapdeal.qaas.dao;

import com.snapdeal.qaas.entity.UserRole;

public interface IUserRoleDAO
{

	UserRole fetchUserRoleByUserId(Integer id);

}
