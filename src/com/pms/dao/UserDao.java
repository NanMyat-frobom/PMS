package com.pms.dao;

import java.util.List;

import com.pms.form.Task;
import com.pms.form.User;

public interface UserDao {

	public List<User> getUserNameByUserId(int userid);

	public List<User> getAllUsers();

}
