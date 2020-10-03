package com.winkeyes.mongoex.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.winkeyes.mongoex.model.Person;

public interface PersonRespository extends MongoRepository<Person, String>{

	Optional<Person>  findByFname(String fname);
}