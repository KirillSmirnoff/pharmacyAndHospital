package ru.k2.pharmacy_hospital.service;

import ru.k2.pharmacy_hospital.domain.Person;

import java.util.List;

public interface PharmacyService {
    List<Person> findAll();
}
