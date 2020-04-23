package ru.k2.pharmacy_hospital.service;


import ru.k2.pharmacy_hospital.domain.Drug;

import java.util.List;

public interface DrugService {
    List findAll();
    List getDrugByName(String name);
    void saveDrug(Drug person);
    void deleteDrug(long id);

}
