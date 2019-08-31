package com.example.demo.jda;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	
	@Query("select e from User e")
	public List<User> list();

}
