package com.sanjay31321.sys.dao;

import java.util.List;

import com.sanjay31321.sys.model.User_Role;

public interface UserRoleDao {
	public List<User_Role> userRoleList();
	public void addUserRole(User_Role user_role);
	public void deleteUserRole(int id);
	public void editUserRole(User_Role user_role);
	public User_Role getUserRole(int id);
}
