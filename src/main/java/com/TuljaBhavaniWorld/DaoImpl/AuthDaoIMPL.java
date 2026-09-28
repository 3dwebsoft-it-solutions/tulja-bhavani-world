package com.TuljaBhavaniWorld.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TuljaBhavaniWorld.Dao.AuthDao;
import com.TuljaBhavaniWorld.Entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

@Repository
public class AuthDaoIMPL implements AuthDao {

	@Autowired
	EntityManager entityManager;

	@Override
	public User loginProcess(String email, String password) {

		try {

			String jpql = "SELECT u FROM User u " + "WHERE u.email = :email " + "AND u.password = :password";

			return entityManager.createQuery(jpql, User.class).setParameter("email", email)
					.setParameter("password", password).getSingleResult();

		} catch (NoResultException e) {

			return null;
		}

	}

	@Override
	public String updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
