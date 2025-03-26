package com.example.beni.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.beni.demo.utils.Utils;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	DemoApplication.display();
	Utils.freeStringDisplay(null);
	Utils.freeStringDisplay("----an other class's function was called------");
	Utils.recursiveFunction(5);
	}

	public static void display() {
		System.out.println("----a function was called------");
	}
}
