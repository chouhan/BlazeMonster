package com.n2s.blazeds.sample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonService {

	static final java.util.logging.Logger log = java.util.logging.Logger.getLogger("PersonService");
	
	public List<Person> getAllPersons()
	{
		
		log.warning("Starting my getAllPerons() method");
		
		List<Person> persons = new ArrayList<Person>();
		
		
		Person p ;
		
		p = new Person();
		p.setAge(20);
		p.setDateOfBirth(new Date());
		p.setFirstName("Rajeswar");
		p.setLastName("N");
		
		persons.add(p);
		
		
		p = new Person();
		p.setAge(21);
		p.setDateOfBirth(new Date());
		p.setFirstName("Rajesh");
		p.setLastName("N");
		
		persons.add(p);
		
		p = new Person();
		p.setAge(22);
		p.setDateOfBirth(new Date());
		p.setFirstName("Raj");
		p.setLastName("N");
		
		persons.add(p);
		
		p = new Person();
		p.setAge(23);
		p.setDateOfBirth(new Date());
		p.setFirstName("R");
		p.setLastName("N");
		
		persons.add(p);
		
		log.info("Ending my getAllPerons() method ====================== ");
		
		return persons;
		
		//Debug
		//Info
		//Warn
		//Error
		//Fatal
		
	
	}

}
