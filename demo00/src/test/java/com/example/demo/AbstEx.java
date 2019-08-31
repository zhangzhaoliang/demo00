package com.example.demo;

import java.util.Date;

public class AbstEx extends Abstr{

	public static void main(String[] args) {
		
		
		Date date = new Date();
		AbstEx s =  new AbstEx();
		s.ss();
	}
	
	public  void ss() {
		String ss = super.aaa();
		
		System.out.println(ss);
	}

}
