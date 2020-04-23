package ru.k2.pharmacy_hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.k2.pharmacy_hospital.dao.HibernateDao;
import ru.k2.pharmacy_hospital.domain.Drug;

import java.util.List;

@Service("drugservice")
@Transactional
public class DrugServiceImpl implements DrugService {

    private HibernateDao dao;

    @Autowired
    public void setDao(HibernateDao dao) {
        this.dao = dao;
    }

    @Override
    public List findAll() {
        return dao.getSession().createCriteria(Drug.class).list() ;
    }

    @Override
    public List getDrugByName(String s) {
        return dao.getSession()
                .createQuery("from Drug d where d.drugName = :name")
                .setParameter("name",s).list();
    }

    @Override
    public void saveDrug(Drug drug) {
        dao.getSession().saveOrUpdate(drug);
    }

    @Override
    public void deleteDrug(long id) {
        dao.getSession().delete(getDrugById(id));
    }

    public Drug getDrugById(long id){
        return dao.getSession().get(Drug.class, id);
    }
}
