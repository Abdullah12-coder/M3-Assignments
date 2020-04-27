package com.sunsodt.url.Versioning.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.url.Versioning.Entity.Name;
import com.sunsoft.url.Versioning.Entity.Person1;
import com.sunsoft.url.Versioning.Entity.Person2;

@RestController
public class PersonController {

	@GetMapping("v1/person")
	public Person1 person1()
	{
		return new Person1("Sheikh Abdullah");
	}
	
	@GetMapping("v2/person")
	public Person2 person2()
	{
		return new Person2(new Name("Sheikh","Abdullah"));
	}
}
