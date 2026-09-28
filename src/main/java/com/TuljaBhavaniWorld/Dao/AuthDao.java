package com.TuljaBhavaniWorld.Dao;

import com.TuljaBhavaniWorld.Entity.User;

public interface AuthDao {

	public User loginProcess(String email, String password);

	public String updateUser(User user);

}
