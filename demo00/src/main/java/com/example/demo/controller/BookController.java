package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.BookBean;
import com.example.demo.service.BookBeanService;

@RestController
public class BookController {
	
	@Autowired
	private  BookBeanService bookBeanService;
	
	@RequestMapping("/book/{id}")
    @ResponseBody
    public BookBean getBookById(@PathVariable String id){
        Optional<BookBean> opt =bookBeanService.findById(id);
        BookBean book=opt.get();
        System.out.println(book);
        return book;
    }

	 @RequestMapping("/esSave")
	    @ResponseBody
	    public void Save(){
	        BookBean book=new BookBean("1","ES入门教程","程裕强","2018-10-01");
	        System.out.println(book);
	        bookBeanService.save(book);
	    }
	
}
