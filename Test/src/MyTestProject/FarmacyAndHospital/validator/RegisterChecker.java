package MyTestProject.FarmacyAndHospital.validator;

import MyTestProject.FarmacyAndHospital.domain.Role;
import MyTestProject.FarmacyAndHospital.domain.Staff;

public class RegisterChecker {

    public Staff checkLogin(String log, String pass) {
        System.out.println("Welcome "+ log);
        return new Staff(new Role("Administrator"));
    }

    public void register(){
        System.out.println("let register");
    }
}
