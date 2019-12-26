package ru.k2.pharmacy_hospital;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.k2.pharmacy_hospital.domain.Person;
import ru.k2.pharmacy_hospital.domain.PharmacyRole;
import ru.k2.pharmacy_hospital.domain.PharmacyStaff;


public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");

        PharmacyStaff person = (PharmacyStaff) context.getBean("pharmacyStaff");
        person.getDescription("");

        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

        Metadata metadata = new MetadataSources(serviceRegistry).buildMetadata();

        SessionFactory sessionFactory = metadata.buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        person.setRoleName("Pharmacy_staff");
        person.setStatus(true);

        session.save(context.getBean("pharmacyStaff"));

        session.getTransaction().commit();
        session.close();



//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        String log, pass;
//        Scanner sc = new Scanner(System.in);
//        RegisterChecker checker = new RegisterChecker();
//
//        System.out.println("To continue working with the program please enter log in");
//        System.out.print("Login: > ");
//        log = sc.next();
//        System.out.print("Password: >");
//        pass = sc.next();
//
//        Person person = checker.login(log, pass);
//
//        if (person instanceof PharmacyAdministrativeRole) {
//
//            PharmacyAdministrativeRole staff = (PharmacyAdministrativeRole) person;
//
//            staff.addDrug();
//
//        } else if (person instanceof PharmacyClient) {
//
//            PharmacyClient pharmacyUser = (PharmacyClient) person;
//
//            pharmacyUser.getDescription(sc.next());
//
//            pharmacyUser.searchDrugByName(sc.next());
//        }
//        } else if (person instanceof HospitalUser) {
//            System.out.println("i am a hospital user");
//
//            HospitalUser hospitalUser = (HospitalUser) person;
//
//            hospitalUser.getDescription("Шприц");
//            hospitalUser.searchDrugByName("Эспумизан");
//        }
//         else
//            checker.register();
    }
}