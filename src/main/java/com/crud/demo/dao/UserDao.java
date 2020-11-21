package com.crud.demo.dao;

import java.util.List;
import java.util.Optional;

import com.crud.demo.model.User;

public interface UserDao {

	int save(User user);

	int update(User user);

	int delete(int id);

	List<User> findAll();

	Optional<User> findById(int id);

}
