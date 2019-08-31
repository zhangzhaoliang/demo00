package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.demo.bean.BookBean;

public interface BookBeanService {
	
	Optional<BookBean> findById(String id);

    BookBean save(BookBean blog);

    void delete(BookBean blog);

    Optional<BookBean> findOne(String id);

    List<BookBean> findAll();

    Page<BookBean> findByAuthor(String author, PageRequest pageRequest);

    Page<BookBean> findByTitle(String title, PageRequest pageRequest);


}
