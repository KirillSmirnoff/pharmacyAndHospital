package PharmacyAndHospital.domain;

public class PharmacyUser extends Person {
    String login;
    String password;

    public PharmacyUser(Role role) {
        super(role);
    }
}