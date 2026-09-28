package com.TuljaBhavaniWorld.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.TuljaBhavaniWorld.Entity.ContactMessage;
import com.TuljaBhavaniWorld.ServiceImpl.ContactMessageService;
import com.TuljaBhavaniWorld.ServiceImpl.EmailService;

import ch.qos.logback.core.model.Model;

@Controller
public class ContactMessageController {

	@Autowired
	private ContactMessageService contactMessageService;

	@Autowired
	private EmailService emailService;

	@PostMapping("/contactMessage")
	public String sendContactMessage(@ModelAttribute ContactMessage contactMessage) {

		// 1. Save message into database
		ContactMessage savedMessage = contactMessageService.saveMessage(contactMessage);

		// 2. Send message to manager
		emailService.sendContactMessage(savedMessage);

		return "redirect:/contactMessage?success=true";
	}

	@GetMapping("/listOfAllContactMessages")
	public ModelAndView getAllContactMessages(Model model) {

		List<ContactMessage> getList = contactMessageService.getAllContactMessages();

		ModelAndView mav = new ModelAndView("ListOfContactMessages");
		mav.addObject("messages", getList);

		return mav;

	}

	@PostMapping("/deleteContactMessageById/{id}")
	public String deleteUserPage(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {

		contactMessageService.deleteContactMessage(id);
		redirectAttributes.addFlashAttribute("msg", "User deleted successfully!");

		return "redirect:/listOfAllContactMessages";

	}

}
