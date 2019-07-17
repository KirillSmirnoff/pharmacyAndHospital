package domain;


import dao.ConnectToBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Person {
    long Id;
    String firstNmae;
    String lastNmae;
    String gender;
    String phoneNumber;
    String email;
    public Role role;
    boolean status;

    private static final String DESCRIPTION = "SELECT drug_name, product_type, active_ingreds, manufacturer," +
            " country_origin, pharma_group, form_and_pack from drug where drug_name= ?";

    private static final String SEARCH = "SELECT drug_name FROM drug WHERE drug_name LIKE ? ";

    public Person(Role role) {
        this.role = role;
    }

    public void searchDrugByName(String drug) {

        try (Connection con = ConnectToBase.connect();
             PreparedStatement stmt = con.prepareStatement(SEARCH)){

            con.setAutoCommit(false);

            try {
                stmt.setString(1,"%"+drug+"%");
                ResultSet resultSet = stmt.executeQuery();

                while(resultSet.next())
                    System.out.println(resultSet.getString("drug_name"));

                con.commit();

            } catch (SQLException e) {
                con.rollback();
                e.printStackTrace();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void getDescription(String drug) {

        try (Connection con = ConnectToBase.connect();
             PreparedStatement stmt = con.prepareStatement(DESCRIPTION)) {

            con.setAutoCommit(false);

            try {
                stmt.setString(1, drug);

                ResultSet descript = stmt.executeQuery();

                if (descript.next()) {
                    System.out.println("\nНазвание препарата:               " + descript.getString("drug_name"));
                    System.out.println("Вид товара:                         " + descript.getString("product_type"));
                    System.out.println("Действующие вещества:               " + descript.getString("active_ingreds"));
                    System.out.println("Производитель:                      " + descript.getString("manufacturer"));
                    System.out.println("Страна происхождения:               " + descript.getString("country_origin"));
                    System.out.println("Фармакотерапевтическая группа:      " + descript.getString("pharma_group"));
                    System.out.println("Форма выпуска:                      " + descript.getString("form_and_pack") + "\n");
                }

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
