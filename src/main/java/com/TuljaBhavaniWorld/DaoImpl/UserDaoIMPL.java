package com.TuljaBhavaniWorld.DaoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.TuljaBhavaniWorld.Dao.UserDao;
import com.TuljaBhavaniWorld.Entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class UserDaoIMPL implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public String addUser(User user) {

		User existingUser = getUserByEmail(user.getEmail());

		if (existingUser != null) {

			return null;
		}

		entityManager.persist(user);

		return "User Added Successfully...";

	}

	public User getUserByEmail(String email) {

		try {
			Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email");

			query.setParameter("email", email);

			return (User) query.getSingleResult();

		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public User updateUserById(Long id, User user) {

		User updateUser = entityManager.find(User.class, id);

		if (updateUser == null) {
			return null;
		}

		// Check duplicate mobile number
		String mobileNumber = user.getMobileNumber();

		User duplicateMobile = entityManager
				.createQuery("SELECT u FROM User u WHERE u.mobileNumber = :mobileNumber AND u.id <> :id", User.class)
				.setParameter("mobileNumber", mobileNumber).setParameter("id", id).getResultStream().findFirst()
				.orElse(null);

		if (duplicateMobile != null) {
			throw new RuntimeException("Mobile number " + mobileNumber + " is already registered.");
		}

		// Check duplicate email
		String email = user.getEmail();

		User duplicateEmail = entityManager
				.createQuery("SELECT u FROM User u WHERE u.email = :email AND u.id <> :id", User.class)

				.setParameter("email", email).setParameter("id", id).getResultStream().findFirst().orElse(null);

		if (duplicateEmail != null) {
			throw new RuntimeException("Email " + email + " is already registered.");
		}

		// Update user
		updateUser.setEmail(user.getEmail());
		updateUser.setFirstName(user.getFirstName());
		updateUser.setLastName(user.getLastName());
		updateUser.setMobileNumber(user.getMobileNumber());
		updateUser.setRole(user.getRole());
		updateUser.setGender(user.getGender());

		System.out.println(updateUser);

		return updateUser;
	}

	@Override
	public User getUserById(Long id) {
		return entityManager.find(User.class, id);
	}

	@Override

	public List<User> getAllUsers() {

		List<User> userList = entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();

		return userList;
	}

	@Override
	public List<User> getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUserById(Long id) {
		Boolean isDeleted = false;

		User deleteUser = entityManager.find(User.class, id);

		if (deleteUser != null) {

			entityManager.remove(deleteUser);
			isDeleted = true;
		} else {
			return isDeleted;
		}

		return isDeleted;
	}

	@Override
	public String saveUser(User user) {

		entityManager.persist(user);
		entityManager.flush();
		return "User Added Successfully..";
	}

}
