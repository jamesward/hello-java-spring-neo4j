package com.example.service;

import com.example.model.Person;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.repository.NamedIndexRepository;

public interface PersonService extends GraphRepository<Person> {

    
}
