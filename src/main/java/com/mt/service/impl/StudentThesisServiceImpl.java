/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mt.service.impl;

import com.mt.pojos.StudentThesis;
import com.mt.repository.StudentThesisRepository;
import com.mt.service.StudentThesisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MT
 */
@Service
public class StudentThesisServiceImpl implements StudentThesisService{
    @Autowired
    private StudentThesisRepository thesisRepository;

    @Override
    public List<StudentThesis> geStudentThesises() {
        return this.thesisRepository.getStudentThesises();
    }
    
}
