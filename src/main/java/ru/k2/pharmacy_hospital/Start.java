package ru.k2.pharmacy_hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.k2.pharmacy_hospital.domain.Person;
import ru.k2.pharmacy_hospital.service.PharmacyServiceImpl;

import java.util.List;


public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");

        PharmacyServiceImpl dao = context.getBean(PharmacyServiceImpl.class);

        List<Person> list = dao.findAll();
        for (Person p: list)
            System.out.println(p.getLastName());
    }
}