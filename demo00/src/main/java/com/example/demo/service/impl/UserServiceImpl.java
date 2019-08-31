package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.User;
import com.example.demo.jda.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserRepository userRepository;

	@Override
	public List<User> queryUserList() {
		List<User> list = (List<User>) userRepository.list();
		return list;
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
		
	}

	@Override
	public Stream<User> stlist() {
		@SuppressWarnings("unchecked")
		Stream<User> list = (Stream<User>) userRepository.findAll();
		return list;
	}
	
}
