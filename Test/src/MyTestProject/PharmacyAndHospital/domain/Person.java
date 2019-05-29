package MyTestProject.PharmacyAndHospital.domain;

public class Person {
    long Id;
    String firstNmae;
    String lastNmae;
    String gender;
    String phoneNumber;
    String email;
    public Role role;
    boolean status;

    public Person(Role role) {
        this.role = role;
    }

    public void searchDrugByName(String drug) {
        System.out.println("not found  " + drug + " in data base");
    }

    public void getDescription(String drug) {
        System.out.println(drug + " is perfect drug for your friends");
    }
}
