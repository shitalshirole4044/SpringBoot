package com.jp.test.repo;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.dao.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	
}
