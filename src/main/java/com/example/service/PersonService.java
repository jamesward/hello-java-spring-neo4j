package com.example.service;

import com.example.model.Person;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface PersonService extends GraphRepository<Person> {

    
}
