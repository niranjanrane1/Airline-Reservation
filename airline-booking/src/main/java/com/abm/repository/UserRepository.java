package com.abm.repository;

import org.springframework.data.repository.CrudRepository;

import com.abm.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
