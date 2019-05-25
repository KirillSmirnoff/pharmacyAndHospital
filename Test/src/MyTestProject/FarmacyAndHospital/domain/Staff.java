package MyTestProject.FarmacyAndHospital.domain;

public class Staff extends Person {

    public Staff(Role role) {
        super(role);
    }

    public void addDrug(String drug){
        System.out.println(drug + " was added to data base");
    }

}
