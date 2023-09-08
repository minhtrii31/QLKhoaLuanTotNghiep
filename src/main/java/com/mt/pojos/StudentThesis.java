/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mt.pojos;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author MT
 */
@Entity
@Table(name = "studentthesis")
public class StudentThesis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "student_thesis_id")
    private int studentThesisId;

    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "user_id")
    private User student;

    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "thesis_id")
    private Thesis thesis;

    public StudentThesis() {
    }

    public StudentThesis(User student, Thesis thesis) {
        this.student = student;
        this.thesis = thesis;
    }

    /**
     * @return the studentThesisId
     */
    public int getStudentThesisId() {
        return studentThesisId;
    }

    /**
     * @param studentThesisId the studentThesisId to set
     */
    public void setStudentThesisId(int studentThesisId) {
        this.studentThesisId = studentThesisId;
    }

    /**
     * @return the student
     */
    public User getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(User student) {
        this.student = student;
    }

    /**
     * @return the thesis
     */
    public Thesis getThesis() {
        return thesis;
    }

    /**
     * @param thesis the thesis to set
     */
    public void setThesis(Thesis thesis) {
        this.thesis = thesis;
    }

}
