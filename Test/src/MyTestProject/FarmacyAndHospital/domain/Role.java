package MyTestProject.FarmacyAndHospital.domain;

public class Role {
    long id;
    public String roleName;
    String description;
    boolean status;

    public Role(String roleName) {
        this.roleName = roleName;
    }
}
