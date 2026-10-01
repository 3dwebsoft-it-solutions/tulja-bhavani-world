package com.TuljaBhavaniWorld.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TuljaBhavaniWorld.Entity.User;

public interface AdminRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmailAndRoleIgnoreCase(String email, String role);
}
