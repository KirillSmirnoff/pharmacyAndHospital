package ru.k2.pharmacy_hospital.domain;

public class PharmacyUser implements PharmacyClient {
    @Override
    public void searchDrugByName(String drug) {

    }

    @Override
    public void getDescription(String drug) {
        System.out.println(getClass());
    }

}
