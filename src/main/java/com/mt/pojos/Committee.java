/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mt.pojos;

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
@Table(name = "committee")
public class Committee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "committee_id")
    private int committeeId;

    @ManyToOne
    @JoinColumn(name = "chairperson_id", referencedColumnName = "user_id")
    private User chairperson;

    @ManyToOne
    @JoinColumn(name = "secretary_id", referencedColumnName = "user_id")
    private User secretary;

    @ManyToOne
    @JoinColumn(name = "member1_id", referencedColumnName = "user_id")
    private User member1;

    @ManyToOne
    @JoinColumn(name = "member2_id", referencedColumnName = "user_id")
    private User member2;

    public Committee() {
    }

    public Committee(User chairperson, User secretary, User member1, User member2) {
        this.chairperson = chairperson;
        this.secretary = secretary;
        this.member1 = member1;
        this.member2 = member2;
    }

    /**
     * @return the committeeId
     */
    public int getCommitteeId() {
        return committeeId;
    }

    /**
     * @param committeeId the committeeId to set
     */
    public void setCommitteeId(int committeeId) {
        this.committeeId = committeeId;
    }

    /**
     * @return the chairperson
     */
    public User getChairperson() {
        return chairperson;
    }

    /**
     * @param chairperson the chairperson to set
     */
    public void setChairperson(User chairperson) {
        this.chairperson = chairperson;
    }

    /**
     * @return the secretary
     */
    public User getSecretary() {
        return secretary;
    }

    /**
     * @param secretary the secretary to set
     */
    public void setSecretary(User secretary) {
        this.secretary = secretary;
    }

    /**
     * @return the member1
     */
    public User getMember1() {
        return member1;
    }

    /**
     * @param member1 the member1 to set
     */
    public void setMember1(User member1) {
        this.member1 = member1;
    }

    /**
     * @return the member2
     */
    public User getMember2() {
        return member2;
    }

    /**
     * @param member2 the member2 to set
     */
    public void setMember2(User member2) {
        this.member2 = member2;
    }

}
