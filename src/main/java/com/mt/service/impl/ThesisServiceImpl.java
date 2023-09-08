/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mt.service.impl;

import com.mt.pojos.Thesis;
import com.mt.repository.ThesisRepository;
import com.mt.service.ThesisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MT
 */
@Service
public class ThesisServiceImpl implements ThesisService{
    @Autowired
    private ThesisRepository thesisRepository;
    @Override
    public List<Thesis> geThesises() {
        return this.thesisRepository.getTheses();
    }
    
}
