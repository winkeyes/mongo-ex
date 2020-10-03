package com.winkeyes.mongoex.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winkeyes.mongoex.model.Person;
import com.winkeyes.mongoex.repo.PersonRespository;

@Service
public class MainService {
	@Autowired
	public PersonRespository personRespository;
	
	
	public String getName(String name) throws InterruptedException {
		return personRespository.findByFname(name).get().toString();
	}

	public List<Person> getAll() throws InterruptedException {
		return personRespository.findAll();
	}
}
