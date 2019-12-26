package ru.k2.pharmacy_hospital.domain;

import java.io.Serializable;

public interface PharmacyRole extends Serializable {

    void searchDrugByName(String drug);

    void getDescription(String drug);

}
