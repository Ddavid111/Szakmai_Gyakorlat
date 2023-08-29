package com.example.proba.entity;


import org.junit.jupiter.api.Test;


import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
class FilesTest {


    @Test
    void getId() {
        Files file = new Files();
        file.setId(5);
        assertEquals(5,file.getId());
    }

    @Test
    void setId() {
        Files file = new Files();
        file.setId(5);
        assertEquals(5,file.getId());
    }

    @Test
    void getName() {
        Files file = new Files();
        file.setName("asd");
        assertEquals("asd",file.getName());
    }

    @Test
    void setName() {
        Files file = new Files();
        file.setName("asd");
        assertEquals("asd",file.getName());
    }

    @Test
    void getUploadTime() {
        Files file = new Files();

        file.setUploadTime(new Date(2023,Calendar.AUGUST,22));
        assertEquals(new Date(2023, Calendar.AUGUST,22), file.getUploadTime());

    }

    @Test
    void setUploadTime() {
        Files file = new Files();

        file.setUploadTime(new Date(2023,Calendar.AUGUST,22));
        assertEquals(new Date(2023,Calendar.AUGUST,22), file.getUploadTime());
    }
}