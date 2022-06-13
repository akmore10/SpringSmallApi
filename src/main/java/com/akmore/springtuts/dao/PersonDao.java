package com.akmore.springtuts.dao;

import com.akmore.springtuts.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
    int deletePersonById(UUID id);
    int updatePersonById(UUID id,Person person);
    List<Person> selectAllPeople();
    Optional<Person> selectPersonById(UUID id);

    default  int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
