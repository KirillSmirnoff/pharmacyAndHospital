package MyTestProject.PharmacyAndHospital;

import MyTestProject.PharmacyAndHospital.domain.*;
import MyTestProject.PharmacyAndHospital.validator.RegisterChecker;

import java.util.Scanner;


public class Start {

    public static void main(String[] args) {

//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

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

            Staff staff = (Staff) person;

            staff.addDrug();

        } else if (person instanceof PharmacyUser) {

            PharmacyUser pharmacyUser = (PharmacyUser) person;

//            pharmacyUser.getDescription(sc.next());

            pharmacyUser.searchDrugByName(sc.next());
        }
//        } else if (person instanceof HospitalUser) {
//            System.out.println("i am a hospital user");
//
//            HospitalUser hospitalUser = (HospitalUser) person;
//
//            hospitalUser.getDescription("Шприц");
//            hospitalUser.searchDrugByName("Эспумизан");
//        }
         else
            checker.register();
    }
}