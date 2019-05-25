package MyTestProject.FarmacyAndHospital.domain;

import java.util.Date;
import java.util.Map;

public class HospitalUser extends Person {

    String disease;
    Date birthday;
    Address address;
    Map<Drug, String> listOfDrugs;

    public HospitalUser(Role role) {
        super(role);
    }

    @Override
    public void searchDrugByName(String drug) {
        super.searchDrugByName(drug);
    }

    @Override
    public void getDescription(String drug) {
        super.getDescription(drug);
    }
}
