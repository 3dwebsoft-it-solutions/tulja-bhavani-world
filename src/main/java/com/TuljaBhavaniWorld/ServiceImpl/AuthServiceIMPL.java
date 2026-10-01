package com.TuljaBhavaniWorld.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TuljaBhavaniWorld.Dao.AuthDao;
import com.TuljaBhavaniWorld.Entity.User;
import com.TuljaBhavaniWorld.Service.AuthService;

@Service
public class AuthServiceIMPL implements AuthService {


	private final AuthDao authDao;
	
	AuthServiceIMPL(AuthDao authDao){
		this.authDao=authDao;
	}

	@Override
	public User loginProcess(String email, String password) {

		User user = authDao.loginProcess(email, password);

		if (user != null) {
			if (password.equals(user.getPassword())) {
				return user;
			} else {
				return null;
			}

		} else {
			return null;
		}
	}

//	@Override
//	public String updateUser(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
