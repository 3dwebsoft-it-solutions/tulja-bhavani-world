package com.TuljaBhavaniWorld.Dao;

import java.util.List;

import com.TuljaBhavaniWorld.Entity.User;

public interface UserDao {

	public String addUser(User user);

	public User getUserById(Long id);

	public User updateUserById(Long id, User user);

	public Boolean deleteUserById(Long id);

	public List<User> getAllUsers();

	public List<User> getUserByName(String name);

	public String saveUser(User user);

}
