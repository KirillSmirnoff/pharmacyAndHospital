package MyTestProject.FarmacyAndHospital.domain;

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
}
