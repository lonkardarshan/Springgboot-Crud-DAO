package com.CRUD.SpringBoot.CRUD.DAO.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.CRUD.SpringBoot.CRUD.DAO.Service.UserServiceImpl;
import com.CRUD.SpringBoot.CRUD.DAO.model.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Controller {

	@Autowired
	private UserServiceImpl userService;

	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserbyId(id);
	}

	@PostMapping("api/users")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@PutMapping("/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody User user) {
		return userService.updateUser(id, user);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
}
