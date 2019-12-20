package ru.k2.pharmacy_hospital.domain;


public class Person{

//    long Id;
//    String login;
//    String pass;
//    String firstNmae;
//    String lastNmae;
//    String gender;
//    String phoneNumber;
//    String email;
//    boolean status;
    PharmacyRole user;

    public Person() {
    }

    public Person(PharmacyRole role) {
        user = role;
    }

    private static final String DESCRIPTION = "SELECT drug_name, product_type, active_ingreds, manufacturer," +
            " country_origin, pharma_group, form_and_pack from drug where drug_name= ?";

    private static final String SEARCH = "SELECT drug_name FROM drug WHERE drug_name LIKE ? ";

    private static final String DRUG = "INSERT INTO drug(drug_name, product_type, active_ingreds, " +
            "manufacturer, country_origin, pharma_group, form_and_pack) VALUES (?, ?, ?, ?, ?, ?, ?)";


//    public void searchDrugByName(String drug) {
//
//        try (Connection con = ConnectToBase.connect();
//             PreparedStatement stmt = con.prepareStatement(SEARCH)){
//
//            con.setAutoCommit(false);
//
//            try {
//                stmt.setString(1,"%"+drug+"%");
//                ResultSet resultSet = stmt.executeQuery();
//
//                while(resultSet.next())
//                    System.out.println(resultSet.getString("drug_name"));
//
//                con.commit();
//
//            } catch (SQLException e) {
//                con.rollback();
//                e.printStackTrace();
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }

//    public void getDescription(String drug) {
//
//        try (Connection con = ConnectToBase.connect();
//             PreparedStatement stmt = con.prepareStatement(DESCRIPTION)) {
//
//            con.setAutoCommit(false);
//
//            try {
//                stmt.setString(1, drug);
//
//                ResultSet descript = stmt.executeQuery();
//
//                if (descript.next()) {
//                    System.out.println("\nНазвание препарата:               " + descript.getString("drug_name"));
//                    System.out.println("Вид товара:                         " + descript.getString("product_type"));
//                    System.out.println("Действующие вещества:               " + descript.getString("active_ingreds"));
//                    System.out.println("Производитель:                      " + descript.getString("manufacturer"));
//                    System.out.println("Страна происхождения:               " + descript.getString("country_origin"));
//                    System.out.println("Фармакотерапевтическая группа:      " + descript.getString("pharma_group"));
//                    System.out.println("Форма выпуска:                      " + descript.getString("form_and_pack") + "\n");
//                }
//
//                con.commit();
//            } catch (SQLException e) {
//                con.rollback();
//                e.printStackTrace();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }

//    public void addDrug(){
//        Scanner sc = new Scanner(System.in);
//        int index=0;
//
//        try(Connection con = ConnectToBase.connect();
//            PreparedStatement stmt = con.prepareStatement(DRUG)) {
//
//            con.setAutoCommit(false);
//
//            try {
//                System.out.print("Enter drug name > ");
//                stmt.setString(++index,sc.next());
//                System.out.print("Enter product type > ");
//                stmt.setString(++index,sc.next());
//                System.out.print("Enter active ingredients > ");
//                stmt.setString(++index,sc.next());
//                System.out.print("Enter manufacturer > ");
//                stmt.setString(++index,sc.next());
//                System.out.print("Enter country origin > ");
//                stmt.setString(++index,sc.next());
//                System.out.print("Enter pharmacy group > ");
//                stmt.setString(++index,sc.next());
//                System.out.print("Enter form and pack > ");
//                stmt.setString(++index,sc.next());
//
//                stmt.executeUpdate();
//
//                con.commit();
//            } catch (SQLException e) {
//                con.rollback();
//                e.printStackTrace();
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public void hello(){
        user.getDescription("");
    }
}
