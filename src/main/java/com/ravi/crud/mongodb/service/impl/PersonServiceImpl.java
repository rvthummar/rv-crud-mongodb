package com.ravi.crud.mongodb.service.impl;

import com.ravi.crud.mongodb.collection.Person;
import com.ravi.crud.mongodb.repository.PersonRepository;
import com.ravi.crud.mongodb.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public String save(Person person) {
        log.info("inside person impl");
        return personRepository.save(person).getPersonId();
    }

    @Override
    public List<Person> getPeronStartWith(String name) {
        log.info("inside getPeronStartWith impl");
        return personRepository.findByFirstNameStartsWith(name);
    }

    @Override
    public void delete(String id) {
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> getByPersonAge(Integer minAge, Integer maxAge) {
        return personRepository.findPersonByAgeBetween(minAge, maxAge);
    }
}
