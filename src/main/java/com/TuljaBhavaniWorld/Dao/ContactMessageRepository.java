package com.TuljaBhavaniWorld.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TuljaBhavaniWorld.Entity.ContactMessage;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {

//	    List<ContactMessage> findAllByOrderByIdDesc();

}
