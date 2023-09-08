/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mt.repository.impl;

import com.mt.pojos.StudentThesis;
import com.mt.repository.StudentThesisRepository;
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
public class StudentThesisRepositoryImpl implements StudentThesisRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<StudentThesis> getStudentThesises() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From StudentThesis");
        return q.getResultList();
    }
}
