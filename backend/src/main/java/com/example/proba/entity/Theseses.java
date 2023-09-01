package com.example.proba.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Theseses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy = "theseses")
    Set<Reviews> theseses;


    @ManyToOne
    @JoinColumn(name = "semesterId")
    Semesters semesters;

    private Integer studentId;
    private Integer supervisorId;
    private String title;
    private String faculty;
    private String department;
    private String speciality;
    private String language;
    private Integer thesisPdfId;
    private Integer supplementId;
    private Integer defenseScore;
    private Integer subjectScore;
    private Integer finalScore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /*public Integer getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Integer semesterId) {
        this.semesterId = semesterId;
    }*/

    public Semesters getSemesters() {
        return semesters;
    }

    public void setSemesters(Semesters semesters) {
        this.semesters = semesters;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getThesisPdfId() {
        return thesisPdfId;
    }

    public void setThesisPdfId(Integer thesisPdfId) {
        this.thesisPdfId = thesisPdfId;
    }

    public Integer getSupplementId() {
        return supplementId;
    }

    public void setSupplementId(Integer supplementId) {
        this.supplementId = supplementId;
    }

    public Integer getDefenseScore() {
        return defenseScore;
    }

    public void setDefenseScore(Integer defenseScore) {
        this.defenseScore = defenseScore;
    }

    public Integer getSubjectScore() {
        return subjectScore;
    }

    public void setSubjectScore(Integer subjectScore) {
        this.subjectScore = subjectScore;
    }

    public Integer getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Integer finalScore) {
        this.finalScore = finalScore;
    }
}
