package MyTestProject.FarmacyAndHospital.validator;

import MyTestProject.FarmacyAndHospital.domain.*;

public class RegisterChecker {

    public static final String ADMIN = "Administrator";
    public static final String PHARM = "PharmacyUser";
    public static final String HOSPITAL = "HospitalUser";
    public static final String DOC = "Doctor";

    public Person checkLogin(String log, String pass) {

        Person person = checkInDB(log, pass);

        if (ADMIN.equals(person.role.roleName))
            return new Staff(new Role(ADMIN));
        else if (PHARM.equals(person.role.roleName))
            return new PharmacyUser(new Role(PHARM));
        else if (HOSPITAL.equals(person.role.roleName))
            return new HospitalUser(new Role(HOSPITAL));

//        System.out.println("Welcome "+ log+" ");
        else return null;

    }

    private Person checkInDB(String log, String pass) {
        return new Person(new Role(log));
    }

    public void register() {
        System.out.println("let register");
    }
}
