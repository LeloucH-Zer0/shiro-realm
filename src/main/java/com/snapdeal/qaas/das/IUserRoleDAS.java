package com.snapdeal.qaas.das;

import com.snapdeal.qaas.entity.UserRole;

public interface IUserRoleDAS
{

	UserRole fetchUserRoleByUserId(Integer id);

}
