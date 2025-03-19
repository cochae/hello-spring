package com.skuniv.Bookblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookblogApplication.class, args);
		var a = new person();
		a.setName("유채원");
		a.setAge(25);
		a.plusAge();
		System.out.println(a.getAge());
	}
}