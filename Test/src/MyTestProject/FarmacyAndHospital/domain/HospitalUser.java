package MyTestProject.FarmacyAndHospital.domain;

import java.util.Date;
import java.util.Map;

public class HospitalUser extends Person {

    public HospitalUser(Role role, String disease) {
        super(role);
        this.disease = disease;
    }

    String disease;
    Date birthday;
    Address address;
    Map<Drug, String> listOfDrugs;
}
