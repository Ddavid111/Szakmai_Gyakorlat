package com.example.proba.service;

import com.example.proba.dao.SemestersDao;
import com.example.proba.entity.Semesters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemestersService {
    @Autowired
    private SemestersDao semestersDao;

    public void testInit(Integer year, Integer month, String location)
    {
        Semesters semesterTest = new Semesters();
        semesterTest.setYear(year);
        semesterTest.setMonth(month);
        semesterTest.setLocation(location);
        semestersDao.save(semesterTest);

    }




}
