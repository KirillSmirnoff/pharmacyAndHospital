package ru.k2.pharmacy_hospital.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "role")
public class PharmacyStaff implements PharmacyAdministrativeRole {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "role_name")
    private String roleName;

    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

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
