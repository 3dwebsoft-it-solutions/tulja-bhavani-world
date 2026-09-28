package com.TuljaBhavaniWorld.Service;

import com.TuljaBhavaniWorld.Entity.User;

public interface AuthService {

	public User loginProcess(String email, String password);

	public String updateUser(User user);

}
