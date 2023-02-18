package com.ravi.crud.mongodb.service;

import com.ravi.crud.mongodb.collection.Person;

import java.util.List;

public interface PersonService {
    String save(Person person);

    List<Person> getPeronStartWith(String name);

    void delete(String id);

    List<Person> getByPersonAge(Integer minAge, Integer maxAge);
}
