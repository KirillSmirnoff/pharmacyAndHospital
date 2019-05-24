package MyTestProject.FarmacyAndHospital.domain;

public class PharmacyUser extends Person {
    String login;
    String password;

    public PharmacyUser(Role role) {
        super(role);
    }

//    public PharmacyUser(){
//        super(new Role("Administrator"));
//
//    }

    public void searchDrugByName(String drug){
        System.out.println("not found  "+drug+" in data base");
    }

    public void getDescription(String drug){
        System.out.println(drug + " is perfect drug for your friends");
    }
}
