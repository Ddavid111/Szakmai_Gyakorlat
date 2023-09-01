package com.example.proba.service;

import com.example.proba.dao.TitlesDao;
import com.example.proba.entity.Titles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitlesService {
    @Autowired
    private TitlesDao titlesDao;

    public void testInit(String name){
        Titles titleTest = new Titles();
        titleTest.setName(name);
        titlesDao.save(titleTest);

    }

    public Integer findRoleIdByRoleName(String roleName){

        List<Titles> titles = (List<Titles>) titlesDao.findAll();

        for (Titles t : titles){
            if(t.getName().equals(roleName)){
                return t.getId();
            }

        }

        return -1;

    }

    public List <Titles> collect() {

        return (List<Titles>) titlesDao.findAll();


    }



}
