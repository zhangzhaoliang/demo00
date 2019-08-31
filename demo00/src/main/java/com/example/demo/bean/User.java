package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.example.demo.util.BaseBean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
public class User implements BaseBean{
	
	@Id 
    @GeneratedValue  
	private int id;
	private String name;
	private int pwd;

}
