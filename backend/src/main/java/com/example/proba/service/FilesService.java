package com.example.proba.service;

import com.example.proba.dao.FilesDao;
import com.example.proba.entity.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

@Service
public class FilesService {
    @Autowired
    private FilesDao filesDao;

    public void testInit(String name, Date uploadTime) {
        File fileTest = new File();
        fileTest.setName(name);
        fileTest.setUploadTime(uploadTime);
        filesDao.save(fileTest);
    }

    public void uploadFile(MultipartFile file){
        File fileTest = new File();
        String filename = file.getOriginalFilename();

        fileTest.setUploadTime( new Date(System.currentTimeMillis()));
        try {
            if(file.getContentType().contains("presentation"))
            {
                Files.write(Paths.get("ppts/" + filename), file.getBytes());
                fileTest.setName("ppts/" + filename);
                filesDao.save(fileTest);
            }
            else if(file.getContentType().equals("application/pdf")) {
                Files.write(Paths.get("pdfs/" + filename), file.getBytes());
                fileTest.setName("pdfs/" + filename);
                filesDao.save(fileTest);
            }
            else if(file.getContentType().equals("application/zip")) {
                Files.write(Paths.get("attachments/" + filename), file.getBytes());
                fileTest.setName("attachments/" + filename);
                filesDao.save(fileTest);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
