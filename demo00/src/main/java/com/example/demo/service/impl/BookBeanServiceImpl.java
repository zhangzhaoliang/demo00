package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.bean.BookBean;
import com.example.demo.es.jpa.EsBookRepository;
import com.example.demo.service.BookBeanService;

@Service("bookBeanService")
public class BookBeanServiceImpl implements BookBeanService {
	
	@Autowired
	@Qualifier("esBookRepository")
	private  EsBookRepository esBookRepository;

	@Override
	public Optional<BookBean> findById(String id) {
		return esBookRepository.findById(id);
	}

	@Override
	public BookBean save(BookBean blog) {
		// TODO Auto-generated method stub
		return esBookRepository.save(blog);
	}

	@Override
	public void delete(BookBean blog) {
		// TODO Auto-generated method stub
		esBookRepository.delete(blog);
	}

	@Override
	public Optional<BookBean> findOne(String id) {
		// TODO Auto-generated method stub
		 return esBookRepository.findById(id);
	}

	@Override
	public List<BookBean> findAll() {
		// TODO Auto-generated method stub
		return (List<BookBean>) esBookRepository.findAll();
	}

	@Override
	public Page<BookBean> findByAuthor(String author, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return esBookRepository.findByAuthor(author,pageRequest);
	}

	@Override
	public Page<BookBean> findByTitle(String title, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return esBookRepository.findByTitle(title,pageRequest);
	}

}
