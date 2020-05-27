package ru.k2.pharmacy_hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.k2.pharmacy_hospital.dao.HibernateDao;
import ru.k2.pharmacy_hospital.domain.Person;
import ru.k2.pharmacy_hospital.domain.Role;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    private final  HibernateDao dao;
    private  final  BCryptPasswordEncoder passwordEncoder;
    private  final  RoleServiceImpl roleService;

    @Autowired
    public PersonServiceImpl(HibernateDao dao, BCryptPasswordEncoder passwordEncoder, RoleServiceImpl roleService) {
        this.dao = dao;
        this.passwordEncoder = passwordEncoder;
        this.roleService = roleService;
    }

    @Override
    public Person getPersonById(Long id) {
        return dao.getSession().get(Person.class,id);
    }

    @Override
    public void savePerson(Person person) {
        Role role = roleService.getRoleByID(2L);
        person.setPassword(passwordEncoder.encode(person.getPassword()));
        person.getRoles().add(role);
        role.getUsers().add(person);
//        Set<Role> roleSet = new HashSet<>();
//        roleSet.add(role);
//        person.setRoles(roleSet);
        dao.getSession().saveOrUpdate(person);
    }

    @Override
    public List findAll() {
        return dao.getSession().createCriteria(Person.class).list();
    }

    @Override
    public void deletePerson(Long id) {
        dao.getSession().delete(getPersonById(id));
    }

    @Override
    public void editPerson(Person person) {
               savePerson(person);
    }

    public List getPersonByName(String username) {
        return dao.getSession().createQuery("from Person p where p.login= :name")
                .setParameter("name", username).list();
    }

}
