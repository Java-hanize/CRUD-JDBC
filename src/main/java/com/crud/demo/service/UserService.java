package com.crud.demo.service;

import java.util.List;

import com.crud.demo.model.User;

public interface UserService {

	public void createUser(User user);

	public void updateUser(User user);

	public void deleteUser(int id);

	public List<User> getUsers();

	public User getUserById(int id);

}
