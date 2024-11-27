package com.CRUD.SpringBoot.CRUD.DAO.Service;

import java.util.List;

import com.CRUD.SpringBoot.CRUD.DAO.model.User;

public interface UserService {
 List<User> getAllUsers();
 User getUserbyId(Long id);
 User createUser(User user);
 User updateUser(Long id, User user);
 void deleteUser(Long id);
 
 
}

