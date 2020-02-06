package ru.k2.pharmacy_hospital.service;

import ru.k2.pharmacy_hospital.domain.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();
    Person getPersonByName();
    void savePerson(Person person);
}
