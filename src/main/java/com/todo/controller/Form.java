package com.todo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.todo.pojo.Person;



@RestController
public class Form {

	/**
	 * @param name
	 *  URL - http://localhost:8080/form?name=meg
	 * @return
	 */
	@RequestMapping(value = "/form")
	public String formName(@RequestParam(value = "name") String name ) {
		return "Heyy "+ name;
	}


	/**
	 * @RequestMapping with @PathVariable
	 * 
	 * URL - http://localhost:8080/form/21
	 * 
	 */
	@RequestMapping(value = "/form/{age}")
	public String formAge(@PathVariable("age")  int age) {
		return "<h1>Hi you have lived on earth for  "+age+" years!!!</h1>";
	}

	/**
	 * @param name
	 * @param age
	 * 
	 *URL : http://localhost:8080/form/person?name=meghana,age=21
	 * 
	 * @return
	 */
	@RequestMapping("/form/person") public Person person(@RequestParam(value = "name", defaultValue="Human" ) String name, @RequestParam(value = "age", defaultValue = "100000") int age )
	{
		return new Person(name, age); 
	}

}