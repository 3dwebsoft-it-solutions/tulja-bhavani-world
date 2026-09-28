package com.TuljaBhavaniWorld.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.TuljaBhavaniWorld.Entity.RequestPrice;
import com.TuljaBhavaniWorld.ServiceImpl.EmailService;
import com.TuljaBhavaniWorld.ServiceImpl.RequestPriceService;

@Controller
public class RequestPriceController {

	@Autowired
	private RequestPriceService requestPriceService;

	@Autowired
	private EmailService emailService;

	@PostMapping("/requestPrice")
	public String requestPrice(@ModelAttribute RequestPrice requestPrice) {

		// save request
		RequestPrice saveMessage = requestPriceService.saveMessage(requestPrice);

		// send email
		emailService.requestPrice(saveMessage);

		return "redirect:/requestPrice?success=true";
	}

	@GetMapping("/requestPrice")
	public ModelAndView requestPricePage() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("RequestPrice");

		return mav;
	}

	@GetMapping("/listOfRequestPrice")
	public ModelAndView getListOfRequestPricePage(@RequestParam(value = "message", required = false) String message) {

		List<RequestPrice> totalList = requestPriceService.getListOfRequestPricePage();

		ModelAndView mav = new ModelAndView("ListOfRequestPrice");

		mav.addObject("messages", totalList);
		mav.addObject("message", message);

		return mav;
	}

	// Open Update Form

	@GetMapping("/updateRequestPriceById/{id}")
	public ModelAndView updateRequestPriceById(@PathVariable Long id) {

		RequestPrice isUpdateRequestPrice = requestPriceService.updateRequestPriceById(id);

		ModelAndView mav = new ModelAndView("updateRequestPrice");

		mav.addObject("requestPrice", isUpdateRequestPrice);

		return mav;
	}

	// Submit update form

	@PostMapping("/updateRequestPriceById/{id}")
	public String updateRequestPriceById(@PathVariable Long id, @ModelAttribute RequestPrice requestPrice) {

		requestPriceService.updateRequestPriceById(id, requestPrice);

		return "redirect:/listOfRequestPrice?message=Request Price updated successfully";

	}

	@PostMapping("/deleteRequestPriceById/{id}")
	public String deleteRequestPriceById(@PathVariable Long id) {

		requestPriceService.deleteRequestPriceById(id);

		return "redirect:/listOfRequestPrice?message=Request Price deleted successfully";
	}

}
