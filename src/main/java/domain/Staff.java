package domain;

import PharmacyAndHospital.dao.ConnectToBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Staff extends Person {
    private static final String DRUG = "INSERT INTO drug(drug_name, product_type, active_ingreds, " +
            "manufacturer, country_origin, pharma_group, form_and_pack) VALUES (?, ?, ?, ?, ?, ?, ?)";

    public Staff(Role role) {
        super(role);
    }

    public void addDrug(){
        Scanner sc = new Scanner(System.in);
        int index=0;

        try(Connection con = ConnectToBase.connect();
            PreparedStatement stmt = con.prepareStatement(DRUG)) {

            con.setAutoCommit(false);

            try {
                System.out.print("Enter drug name > ");
                stmt.setString(++index,sc.next());
                System.out.print("Enter product type > ");
                stmt.setString(++index,sc.next());
                System.out.print("Enter active ingredients > ");
                stmt.setString(++index,sc.next());
                System.out.print("Enter manufacturer > ");
                stmt.setString(++index,sc.next());
                System.out.print("Enter country origin > ");
                stmt.setString(++index,sc.next());
                System.out.print("Enter pharmacy group > ");
                stmt.setString(++index,sc.next());
                System.out.print("Enter form and pack > ");
                stmt.setString(++index,sc.next());

                stmt.executeUpdate();

                con.commit();
            } catch (SQLException e) {
                con.rollback();
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
