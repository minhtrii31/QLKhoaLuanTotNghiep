/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mt.service.impl;

import com.mt.pojos.Criteria;
import com.mt.repository.CriteriaRepository;
import com.mt.service.CriteriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MT
 */
@Service
public class CriteriaServiceImpl implements CriteriaService{
    @Autowired
    private CriteriaRepository criteriaRepository;
    
    @Override
    public List<Criteria> getCriterias() {
        return this.criteriaRepository.getCriterias();
    }
    
}
