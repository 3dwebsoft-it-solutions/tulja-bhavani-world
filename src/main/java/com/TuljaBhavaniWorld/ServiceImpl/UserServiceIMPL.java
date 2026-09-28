package com.TuljaBhavaniWorld.ServiceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TuljaBhavaniWorld.Dao.UserDao;
import com.TuljaBhavaniWorld.Entity.User;
import com.TuljaBhavaniWorld.Service.UserService;

@Service
public class UserServiceIMPL implements UserService {

	@Autowired
	private final UserDao userDao;

	UserServiceIMPL(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public String addUser(User user) {

		String id = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		user.setId(Long.parseLong(id));

		return userDao.addUser(user);

	}

	@Override
	public User getUserById(Long id) {

		return userDao.getUserById(id);
	}

	@Override

	@Transactional
	public User updateUserById(Long id, User user) {

		return userDao.updateUserById(id, user);
	}

	@Override
	public List<User> getAllUsers() {

		return userDao.getAllUsers();
	}

	@Override
	public List<User> getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public Boolean deleteUserById(Long id) {

		return userDao.deleteUserById(id);
	}

	@Transactional
	@Override
	public String saveUser(User user) {

		return userDao.saveUser(user);

	}

}
