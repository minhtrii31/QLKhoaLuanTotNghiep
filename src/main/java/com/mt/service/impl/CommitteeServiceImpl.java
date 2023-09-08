/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mt.service.impl;

import com.mt.pojos.Committee;
import com.mt.repository.CommitteeRepository;
import com.mt.service.CommitteeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MT
 */
@Service
public class CommitteeServiceImpl implements CommitteeService{
    @Autowired
    private CommitteeRepository committeeRepository;
    
    @Override
    public List<Committee> getCommittees() {
        return this.committeeRepository.getCommittees();
    }
    
}
