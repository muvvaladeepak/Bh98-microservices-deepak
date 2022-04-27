package com.example.demo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

@RestController

public class HelloController {
	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello from my spring boot application!";
	}
	
	@RequestMapping("/tools")

	String tools() {
		return "Hello from my spring boot tools application!";
	}
	
	@RequestMapping("/caliculator/{first_value}/{second_value}")

	String caliculator(@PathVariable Double first_value,@PathVariable Double second_value) {
		double a = first_value+second_value;
		double b = first_value-second_value;
		double c = first_value*second_value;
		double d = first_value/second_value;
		return "addition =" +a +"subraction ="+b +" multiplication ="+c+"division ="+d;
	}
	
	
	@RequestMapping("/student/{name}/{id}/{cmarks}/{pmarks}/{mmarks}")
	String myStudents(@PathVariable String name, @PathVariable int id, @PathVariable int cmarks, @PathVariable int pmarks, @PathVariable int mmarks) {
		Student s = new Student(id,name,pmarks,cmarks,mmarks);
		String grade = s.getGrade();
		return "Hello, My name is " +name + " and my id is " + id + " and my grade is " + grade; 
	}
	

}

