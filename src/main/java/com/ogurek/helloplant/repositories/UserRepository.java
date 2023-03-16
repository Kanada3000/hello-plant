package com.ogurek.helloplant.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ogurek.helloplant.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
