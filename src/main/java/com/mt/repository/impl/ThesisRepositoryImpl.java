/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mt.repository.impl;

import com.mt.pojos.Thesis;
import com.mt.repository.ThesisRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author MT
 */
@Repository
public class ThesisRepositoryImpl implements ThesisRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<Thesis> getTheses() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From Thesis");
        return q.getResultList();
    }
}
