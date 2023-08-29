package com.example.proba.service;

import com.example.proba.dao.ReviewsDao;
import com.example.proba.dao.SemestersDao;
import com.example.proba.dao.ThesesesDao;
import com.example.proba.entity.Reviews;
import com.example.proba.entity.Semesters;
import com.example.proba.entity.Theseses;
import com.example.proba.entity.Titles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewsService {
    @Autowired
    private ReviewsDao reviewsDao;

    @Autowired
    private ThesesesDao thesesesDao;

    @Autowired
    private SemestersDao semestersDao;

    public void testInit(Date invitationDate, Integer score, String description, String city, Boolean isAcceptedInvitation, Date responseDate, Date submissionDate) {
        Reviews reviewTest = new Reviews();
        Theseses theseses = new Theseses();
        Semesters semesters = new Semesters();

        semesters.setYear(2001);
        semesters.setMonth(5);
        semesters.setLocation("miskolc");
        semestersDao.save(semesters);


        theseses.setTitle("asd");
        theseses.setFaculty("asd");
        theseses.setFaculty("asd");
        theseses.setDepartment("asd");
        theseses.setSpeciality("asd");
        theseses.setLanguage("asd");
        theseses.setDefenseScore(1);
        theseses.setSubjectScore(1);
        theseses.setFinalScore(1);
        theseses.setStudentId(1);
        theseses.setSupervisorId(1);
        theseses.setSemesters(semesters);
        theseses.setSupplementId(1);
        theseses.setThesisPdfId(1);
        thesesesDao.save(theseses);

        reviewTest.setInvitationDate(invitationDate);
        reviewTest.setScore(score);
        reviewTest.setDescription(description);
        reviewTest.setCity(city);
        reviewTest.setAcceptedInvitation(isAcceptedInvitation);
        reviewTest.setResponseDate(responseDate);
        reviewTest.setSubmissionDate(submissionDate);
        reviewTest.setReviewerId(1);
        reviewTest.setTheseses(theseses);
        reviewsDao.save(reviewTest);


    }






    /*public Integer findRoleIdByUserName(String userName) {

        List<Reviews> reviews = (List<Reviews>) reviewsDao.findAll();

        for (Reviews r : reviews) {
            if (r.getReviewerId().equals(userName)) {
                return r.getId();
            }

        }
        return-1;

    }*/

}