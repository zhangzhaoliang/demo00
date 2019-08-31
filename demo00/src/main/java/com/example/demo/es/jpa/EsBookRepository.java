package com.example.demo.es.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.demo.bean.BookBean;

public interface EsBookRepository  extends ElasticsearchRepository<BookBean, String>{
	
	 	Page<BookBean> findByAuthor(String author, PageRequest pageRequest);

	    Page<BookBean> findByTitle(String title, PageRequest pageRequest);
	

}
