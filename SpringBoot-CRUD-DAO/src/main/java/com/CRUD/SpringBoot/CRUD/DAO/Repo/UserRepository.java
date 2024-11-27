package com.CRUD.SpringBoot.CRUD.DAO.Repo;

import org.springframework.data.repository.CrudRepository;

import com.CRUD.SpringBoot.CRUD.DAO.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
