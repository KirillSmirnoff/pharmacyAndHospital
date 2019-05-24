package MyTestProject.FarmacyAndHospital;

import MyTestProject.FarmacyAndHospital.domain.Role;
import MyTestProject.FarmacyAndHospital.domain.Staff;
import MyTestProject.FarmacyAndHospital.validator.RegisterChecker;

import java.util.Scanner;


public class Start {
    public static void main(String[] args) {
        String log,pass;
        Scanner sc = new Scanner(System.in);
        RegisterChecker checker = new RegisterChecker();

        System.out.println("To continue working with the program please enter log in");
        System.out.print("Login: > ");
        log=sc.next();
        System.out.print("Password: >");
        pass=sc.next();

        Staff staff = checker.checkLogin(log, pass);

        if("Administrator".equals(staff.role.roleName)){
            staff.addDrug("ХАНКА");
            staff.getDescription("НОСОЛГИН");
            staff.searchDrugByName("НОЩ-ПА");
        }

        else
            checker.register();

    }


}