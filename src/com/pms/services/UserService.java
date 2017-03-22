package com.pms.services;

import java.util.List;

import com.pms.form.User;

public interface UserService {

	public List<User> getUserNameByUserId(int userid);

	public List<User> getAllUsers();
}
