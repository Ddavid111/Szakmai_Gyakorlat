package com.example.proba.service;

import com.example.proba.dao.SemestersDao;
import com.example.proba.dao.ThesesesDao;
import com.example.proba.entity.Semesters;
import com.example.proba.entity.Theseses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThesesesService {
    @Autowired
    private ThesesesDao thesesesDao;
    @Autowired
    private SemestersDao semestersDao;
    public void testInit(String title, String faculty, String department, String speciality, String language, Integer defenseScore, Integer subjectScore, Integer finalScore)
    {
        Theseses thesesesTest = new Theseses();
        Semesters semesters = new Semesters();

        semesters.setYear(2001);
        semesters.setMonth(5);
        semesters.setLocation("miskolc");
        semestersDao.save(semesters);
        thesesesTest.setTitle(title);
        thesesesTest.setFaculty(faculty);
        thesesesTest.setDepartment(department);
        thesesesTest.setSpeciality(speciality);
        thesesesTest.setLanguage(language);
        thesesesTest.setDefenseScore(defenseScore);
        thesesesTest.setSubjectScore(subjectScore);
        thesesesTest.setFinalScore(finalScore);
        thesesesTest.setStudentId(1);
        thesesesTest.setSupervisorId(1);
        thesesesTest.setSemesters(semesters);
        thesesesTest.setSupplementId(1);
        thesesesTest.setThesisPdfId(1);
        thesesesDao.save(thesesesTest);
    }

    public List<Theseses> getThesesList() {
        return (List<Theseses>) thesesesDao.findAll();
    }
}
