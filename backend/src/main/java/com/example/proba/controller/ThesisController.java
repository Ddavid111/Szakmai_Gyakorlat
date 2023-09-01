package com.example.proba.controller;

import com.example.proba.entity.Theseses;
import com.example.proba.service.ThesesesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ThesisController {
    @Autowired
    ThesesesService thesesesService;

    @GetMapping("/getThesesList")
    public List<Theseses> getThesesList() {
        return thesesesService.getThesesList();

    }




}
