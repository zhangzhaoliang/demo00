package com.example.demo.service;

import java.util.List;
import java.util.stream.Stream;

import com.example.demo.bean.User;

public interface UserService {
	
	
	public List<User> queryUserList();
	
	public void save(User user);
	
	public Stream<User> stlist();
	
	public default void test() {
		
	};

}
