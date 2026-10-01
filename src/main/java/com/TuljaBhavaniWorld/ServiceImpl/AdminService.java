package com.TuljaBhavaniWorld.ServiceImpl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.TuljaBhavaniWorld.Dao.AdminRepository;
import com.TuljaBhavaniWorld.Entity.User;

@Service
public class AdminService {

	
	private final AdminRepository adminRepository;
	
	
	AdminService(AdminRepository adminRepository){
		this.adminRepository=adminRepository;
	}
	
	public User adminLoginProcess(String email,String password) {
	
		Optional<User> optionalUser = adminRepository.findByEmailAndRoleIgnoreCase(email, "ADMIN");
		
		if(optionalUser.isPresent()) {
			
			User user = optionalUser.get();
			
			if(user.getPassword().equals(password)) {
				
				return user;
			}
		}
		
		return null;
	}	
}
