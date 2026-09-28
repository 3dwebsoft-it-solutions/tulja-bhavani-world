package com.TuljaBhavaniWorld.ServiceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TuljaBhavaniWorld.Dao.ContactMessageRepository;
import com.TuljaBhavaniWorld.Entity.ContactMessage;

@Service
public class ContactMessageService {

	@Autowired
	private ContactMessageRepository contactMessageRepository;

	public ContactMessage saveMessage(ContactMessage contactMessage) {

		contactMessage.setCreatedAt(LocalDateTime.now());

		return contactMessageRepository.save(contactMessage);
	}

	public List<ContactMessage> getAllContactMessages() {

		return contactMessageRepository.findAll();
	}

	public void deleteContactMessage(Long id) {

		contactMessageRepository.deleteById(id);

	}

}
