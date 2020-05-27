package ru.k2.pharmacy_hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.k2.pharmacy_hospital.dao.HibernateDao;
import ru.k2.pharmacy_hospital.domain.Role;

@Service
@Transactional
public class RoleServiceImpl  implements RoleService{

    HibernateDao dao;

    @Autowired
    public RoleServiceImpl(HibernateDao dao) {
        this.dao = dao;
    }

    @Override
    public Role getRoleByID(Long id) {
        Role role = dao.getSession().get(Role.class, id);
        return role;
    }
}
