package com.example.demo.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Document(indexName = "book", type = "_doc")
public @Data @ToString @NoArgsConstructor  class BookBean {
	@Id
    private String id;
    private String title;
    private String author;
    private String postDate;
    
    public BookBean(String id,String title,String author,String postDate) {
    	this.id=id;
    	this.title=title;
    	this.author=author;
    	this.postDate=postDate;
    }
	
	
	
}
