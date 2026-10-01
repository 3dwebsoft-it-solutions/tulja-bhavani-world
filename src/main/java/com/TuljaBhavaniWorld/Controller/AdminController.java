package com.TuljaBhavaniWorld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.TuljaBhavaniWorld.Entity.User;
import com.TuljaBhavaniWorld.ServiceImpl.AdminService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {

	private final AdminService adminService;
	
	AdminController(AdminService adminService){
		this.adminService=adminService;
		
	}
	
	
	
	@PostMapping("/loginProcess")
	public String adminLoginProcess(@RequestParam("email") String email, @RequestParam("password") String password,
			Model model, HttpSession session) {
		
		User admin  = adminService.adminLoginProcess(email,password);
		
		if(admin!=null){
			
			session.setAttribute("admin", admin);
			
			System.out.println("AdminController.adminLoginProcess called");
			
			return "redirect:/admin/dashboard";
		}
		model.addAttribute("msg", "Invalid Admin credintials.");
		
		return "AdminLogin";
	}
	
	
	@GetMapping("/dashboard")
    public String adminDashboard(HttpSession session) {

        User admin = (User) session.getAttribute("admin");
        
        
        
        if (admin == null) {
        	
        	System.out.println("AdminController.adminLoginProcess called");
        	
            return "redirect:admin/adminLogin";
        }

        return "AdminDashboard";
    }
	
}
