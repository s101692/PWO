package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        System.out.println("Start application");
        System.out.println("but like. in a branch way. cuz this is a branch");
        System.out.println("but like. in a branch-er way. cuz this is a branch 2");
        System.out.println("gee i sure hope there won't be any conflicts here :)");
        SpringApplication.run(DemoApplication.class, args);
	}

}
