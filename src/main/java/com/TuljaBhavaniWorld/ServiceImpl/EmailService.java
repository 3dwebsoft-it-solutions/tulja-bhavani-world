package com.TuljaBhavaniWorld.ServiceImpl;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.TuljaBhavaniWorld.Entity.ContactMessage;
import com.TuljaBhavaniWorld.Entity.RequestPrice;

@Service
public class EmailService {

	private final JavaMailSender mailSender;

	@Value("${manager.email}")
	private String managerEmail;

	EmailService(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendContactMessage(ContactMessage contact) {

		SimpleMailMessage mail = new SimpleMailMessage();

		mail.setTo(managerEmail);

		mail.setSubject("New Contact Message - " + contact.getFullName());

		mail.setText("New Contact Message Received\n\n" + "Full Name: " + contact.getFullName() + "\n"
				+ "Phone Number: " + contact.getPhoneNumber() + "\n" + "Email Address: " + contact.getEmailAddress()
				+ "\n" + "Looking For: " + contact.getLookingFor() + "\n\n" + "Message:\n" + contact.getMessage());

		mailSender.send(mail);
	}

	public void requestPrice(RequestPrice saveMessage) {
		// TODO Auto-generated method stub

	}

}
