/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mt.pojos;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author MT
 */
@Entity
@Table(name = "thesis")
public class Thesis {
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "thesis_id")
    private int thesisId;

    @Basic(optional = false)
    @Column(name = "thesis_title", nullable = false)
    private String thesisTitle;

    @Basic(optional = false)
    @Column(name = "thesis_status")
    private String thesisStatus;

    @Basic(optional = false)
    @Column(name = "submission_date")
    @Temporal(TemporalType.DATE)
    private Date submissionDate;

    @Basic(optional = false)
    @Column(name = "completion_date")
    @Temporal(TemporalType.DATE)
    private Date completionDate;

    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "advisor1_id", referencedColumnName = "user_id")
    private User advisor1;

    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "advisor2_id", referencedColumnName = "user_id")
    private User advisor2;

    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "reviewer_id", referencedColumnName = "user_id")
    private User reviewer;

    /**
     * @return the thesisId
     */
    public int getThesisId() {
        return thesisId;
    }

    /**
     * @param thesisId the thesisId to set
     */
    public void setThesisId(int thesisId) {
        this.thesisId = thesisId;
    }

    /**
     * @return the thesisTitle
     */
    public String getThesisTitle() {
        return thesisTitle;
    }

    /**
     * @param thesisTitle the thesisTitle to set
     */
    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    /**
     * @return the thesisStatus
     */
    public String getThesisStatus() {
        return thesisStatus;
    }

    /**
     * @param thesisStatus the thesisStatus to set
     */
    public void setThesisStatus(String thesisStatus) {
        this.thesisStatus = thesisStatus;
    }

    /**
     * @return the submissionDate
     */
    public Date getSubmissionDate() {
        return submissionDate;
    }

    /**
     * @param submissionDate the submissionDate to set
     */
    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    /**
     * @return the completionDate
     */
    public Date getCompletionDate() {
        return completionDate;
    }

    /**
     * @param completionDate the completionDate to set
     */
    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * @return the advisor1
     */
    public User getAdvisor1() {
        return advisor1;
    }

    /**
     * @param advisor1 the advisor1 to set
     */
    public void setAdvisor1(User advisor1) {
        this.advisor1 = advisor1;
    }

    /**
     * @return the advisor2
     */
    public User getAdvisor2() {
        return advisor2;
    }

    /**
     * @param advisor2 the advisor2 to set
     */
    public void setAdvisor2(User advisor2) {
        this.advisor2 = advisor2;
    }

    /**
     * @return the reviewer
     */
    public User getReviewer() {
        return reviewer;
    }

    /**
     * @param reviewer the reviewer to set
     */
    public void setReviewer(User reviewer) {
        this.reviewer = reviewer;
    }
    
}
