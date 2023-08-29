package com.example.proba.service;

import com.example.proba.dao.FilesDao;
import com.example.proba.entity.Files;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class FilesService {
    @Autowired
    private FilesDao filesDao;

    public void testInit(String name, Date uploadTime) {
        Files fileTest = new Files();
        fileTest.setName(name);
        fileTest.setUploadTime(uploadTime);
        filesDao.save(fileTest);
    }
}
