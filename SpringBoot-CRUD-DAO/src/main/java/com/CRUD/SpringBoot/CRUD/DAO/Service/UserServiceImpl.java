package com.CRUD.SpringBoot.CRUD.DAO.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUD.SpringBoot.CRUD.DAO.Repo.UserRepository;
import com.CRUD.SpringBoot.CRUD.DAO.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
private UserRepository userRepository;

 
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserbyId(Long id) {
		Optional<User>OptionalUser=userRepository.findById(id);
		 		return OptionalUser.orElse(null);
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user) ;
	}

	@Override
	public User updateUser(Long id, User user) {
		if(userRepository.existsById(id)) {
			user.setId(id);
			return userRepository.save(user);
			
		}
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
		 
	}
	
}