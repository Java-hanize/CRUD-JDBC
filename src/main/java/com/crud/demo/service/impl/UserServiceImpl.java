package com.crud.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.dao.impl.UserDaoImpl;
import com.crud.demo.model.User;
import com.crud.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDaoImpl userDao;

	public void createUser(User user) {
		userDao.save(user);
	}

	public void updateUser(User user) {
		userDao.update(user);
	}

	public void deleteUser(int id) {
		userDao.delete(id);
	}

	public List<User> getUsers() {

		return userDao.findAll();
	}

	public User getUserById(int id) {

		User user = new User();
		Optional<User> existingUser = userDao.findById(id);
		if (existingUser.isPresent())
			user = existingUser.get();
		return user;
	}

}
