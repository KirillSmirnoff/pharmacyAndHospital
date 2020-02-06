package ru.k2.pharmacy_hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.k2.pharmacy_hospital.dao.HibernateDao;
import ru.k2.pharmacy_hospital.domain.Person;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {


    private HibernateDao dao;

    @Autowired
    public void setDao(HibernateDao dao) {
        this.dao = dao;
    }
    @Override
    public Person getPersonByName() {
        return dao.getSession().get(Person.class,1);
    }

    @Override
    public void savePerson(Person person) {
        dao.getSession().save(person);
    }

    @Override
    public List<Person> findAll() {
        return dao.getSession().createCriteria(Person.class).list();
    }
}
