package com.TuljaBhavaniWorld.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.TuljaBhavaniWorld.Entity.User;
import com.TuljaBhavaniWorld.Service.UserService;

import jakarta.validation.Valid;

@Controller
@ComponentScan
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/addUser")
	public String addUser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {

		try {

			userService.saveUser(user);

			redirectAttributes.addFlashAttribute("successMessage", "User added successfully.");

		} catch (DataIntegrityViolationException e) {

			redirectAttributes.addFlashAttribute("errorMessage",
					"Mobile number already exists." + "or Email Already Exist.");

		}

		return "redirect:/addUser";
	}

	// ===============================
	// UPDATE USER DATA
	// ===============================

	@PostMapping("/updateUserById/{id}")
	public String updateUserById(@PathVariable("id") Long id, @ModelAttribute User user,
			RedirectAttributes redirectAttributes) {

		try {

			User updatedUser = userService.updateUserById(id, user);

			if (updatedUser != null) {

				redirectAttributes.addFlashAttribute("msg", "User updated successfully.");
			}

		} catch (RuntimeException e) {

			redirectAttributes.addFlashAttribute("error", e.getMessage());
		}

		return "redirect:/getAllUsers";
	}

	// ===============================
	// SHOW UPDATE USER PAGE
	// ===============================

	@GetMapping("/updateUserById/{id}")
	public ModelAndView showUpdateUser(@PathVariable("id") Long id, Model model) {

		User user = userService.getUserById(id);

		model.addAttribute("user", user);

		return new ModelAndView("UpdateUser");
	}

	@GetMapping(value = "/getAllUsers")
	public String getAllUsers(Model model) {
		List<User> users = userService.getAllUsers();

		model.addAttribute("users", users);

		return "ListOfUsers";

	}


	
	@PostMapping("/deleteUserById/{id}")
	public ModelAndView deleteUserById(@PathVariable Long id, RedirectAttributes redirectAttributes) {

		userService.deleteUserById(id);

		redirectAttributes.addFlashAttribute("successMsg", "User deleted successfully!");

		return new ModelAndView("redirect:/getAllUsers");
	}

}
