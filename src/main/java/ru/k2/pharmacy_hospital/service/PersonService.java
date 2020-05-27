package ru.k2.pharmacy_hospital.service;

import ru.k2.pharmacy_hospital.domain.Person;

import java.util.List;

public interface PersonService {
    List findAll() ;
    Person getPersonById(Long id);
    void savePerson(Person person);
    void deletePerson(Long id);
    void editPerson(Person person);
}
