package com.example.proba.entity;


import jakarta.persistence.*;
import org.hibernate.mapping.Join;


import java.util.Date;

@Entity
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer reviewerId;
    /*@ManyToOne
    @JoinColumn(name = "reviewerId",insertable = false,updatable = false)
    Reviews reviews;*/


    @ManyToOne
    @JoinColumn(name = "thesisId")
    Theseses theseses;

    //private Integer thesisId;
    private Date invitationDate;
    private Integer Score;
    private String description;
    private String city;
    private Boolean isAcceptedInvitation;
    private Date responseDate;
    private Date submissionDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Integer reviewerId) {
        this.reviewerId = reviewerId;
    }

    public Theseses getTheseses() {
        return theseses;
    }

    public void setTheseses(Theseses theseses) {
        this.theseses = theseses;
    }

    /*public Integer getThesisId() {
        return thesisId;
    }

    public void setThesisId(Integer thesisId) {
        this.thesisId = thesisId;
    }*/

    public Date getInvitationDate() {
        return invitationDate;
    }

    public void setInvitationDate(Date invitationDate) {
        this.invitationDate = invitationDate;
    }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getAcceptedInvitation() {
        return isAcceptedInvitation;
    }

    public void setAcceptedInvitation(Boolean acceptedInvitation) {
        isAcceptedInvitation = acceptedInvitation;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }
}
