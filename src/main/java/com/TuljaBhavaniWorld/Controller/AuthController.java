package com.TuljaBhavaniWorld.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.TuljaBhavaniWorld.Entity.User;
import com.TuljaBhavaniWorld.Service.AuthService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping(value = "/loginProcess")

	public String loginProcess(@RequestParam("email") String email, @RequestParam("password") String password,
			Model model, HttpSession session) {

		User user = authService.loginProcess(email, password);

		if (user != null) {

			session.setAttribute("user", user);

			if ("ADMIN".equalsIgnoreCase(user.getRole())) {
				return "Home";
			}

			if ("EMPLOYEE".equalsIgnoreCase(user.getRole())) {
				return "Home";
			}

			if ("USER".equalsIgnoreCase(user.getRole())) {
				return "Home";
			}

			model.addAttribute("msg", "Invalid user role.");
			return "Login";

		} else {

			model.addAttribute("msg", "Invalid Credential.");
			return "Login";
		}
	}

}
