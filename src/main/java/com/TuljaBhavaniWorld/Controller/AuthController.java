package com.TuljaBhavaniWorld.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.TuljaBhavaniWorld.Entity.User;
import com.TuljaBhavaniWorld.Service.AuthService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {

	private final AuthService authService;

	AuthController(AuthService authService) {
		this.authService = authService;
	}

	@PostMapping(value = "/loginProcess")

	public String loginProcess(@RequestParam("email") String email, @RequestParam("password") String password,
			Model model, HttpSession session) {

		User user = authService.loginProcess(email, password);

		if (user != null) {

			session.setAttribute("user", user);

			if ("ADMIN".equalsIgnoreCase(user.getRole())) {
				
				System.out.println("AuthController.loginProcess called");
				
				return "redirect:/dashboard";
			}

			if ("EMPLOYEE".equalsIgnoreCase(user.getRole())) {
				System.out.println("AuthController.loginProcess called");
				
				return "redirect:/Home";
			}

			if ("USER".equalsIgnoreCase(user.getRole())) {
				
				System.out.println("AuthController.loginProcess called");
				return "redirect:/Home";
			}

			model.addAttribute("msg", "Invalid user role.");
			return "Login";

		} else {

			model.addAttribute("msg", "Invalid Credential, Enter Valid Admin username and password.");
			return "Login";
		}
	}

}
