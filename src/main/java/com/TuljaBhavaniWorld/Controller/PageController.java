package com.TuljaBhavaniWorld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@GetMapping("/")
	public ModelAndView openLoginPage() {

		return new ModelAndView("Login");
	}

	@GetMapping(value = "/home")
	public String homePage() {

		return "Home";

	}

	@GetMapping(value = "/menu")
	public String menuPage() {
		return "Menu";
	}

	@GetMapping(value = "/about")
	public String aboutPage() {
		return "About";
	}

	@GetMapping(value = "/services")
	public String servicePage() {
		return "Services";
	}

	@GetMapping(value = "/projects")
	public String projectsPage() {
		return "Projects";
	}

	@GetMapping(value = "/ourTeam")
	public String ourTeamPage() {
		return "OurTeam";
	}

	@GetMapping(value = "/gallery")
	public String galleryPage() {
		return "Gallery";
	}

	@GetMapping(value = "/careers")
	public String careers() {
		return "Careers";
	}

	@GetMapping(value = "/addUser")
	public String addUser() {
		return "AddUser";
	}

	@GetMapping(value = "/updateUser")
	public String updateUser() {
		return "UpdateUser";
	}

	@GetMapping(value = "/products")
	public String productsPage() {
		return "Products";
	}

	@GetMapping(value = "/branches")
	public String branchesPage() {
		return "Branches";
	}

	@GetMapping(value = "/contact")
	public String contactPage() {
		return "Contact";
	}

	@GetMapping(value = "/toggle")
	public String tooglePage() {
		return "Toggle";
	}

	@GetMapping("/contactMessage")
	public ModelAndView showContactPage() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("ContactMessage");

		return mav;
	}

}
