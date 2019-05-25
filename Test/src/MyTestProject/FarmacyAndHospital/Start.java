package MyTestProject.FarmacyAndHospital;

import MyTestProject.FarmacyAndHospital.domain.*;
import MyTestProject.FarmacyAndHospital.validator.RegisterChecker;

import java.util.Scanner;


public class Start {
    public static void main(String[] args) {
        String log, pass;
        Scanner sc = new Scanner(System.in);
        RegisterChecker checker = new RegisterChecker();

        System.out.println("To continue working with the program please enter log in");
        System.out.print("Login: > ");
        log = sc.next();
        System.out.print("Password: >");
        pass = sc.next();

        Person person = checker.checkLogin(log, pass);

        if (person instanceof Staff) {
            System.out.println("i am admin");

            Staff staff = (Staff) person;

            staff.addDrug("ХАНКА");
            staff.getDescription("НОСОЛГИН");
            staff.searchDrugByName("НОЩ-ПА");

        } else if (person instanceof PharmacyUser) {
            System.out.println("i am pharmacy user");

            PharmacyUser pharmacyUser = (PharmacyUser) person;

            pharmacyUser.getDescription("Глазолин");
            pharmacyUser.searchDrugByName("Бензин");

        } else if (person instanceof HospitalUser) {
            System.out.println("i am a hospital user");

            HospitalUser hospitalUser = (HospitalUser) person;

            hospitalUser.getDescription("Шприц");
            hospitalUser.searchDrugByName("Эспумизан");

        } else
            checker.register();
    }


}

