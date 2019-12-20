package ru.k2.pharmacy_hospital.domain;

public class PharmacyStaff implements PharmacyAdministrativeRole {
    @Override
    public void addDrug() {

    }

    @Override
    public void searchDrugByName(String drug) {

    }

    @Override
    public void getDescription(String drug) {
        System.out.println(getClass());
    }
}
