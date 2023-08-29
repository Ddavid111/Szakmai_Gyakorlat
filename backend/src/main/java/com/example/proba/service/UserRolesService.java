package com.example.proba.service;

import com.example.proba.dao.UserRolesDao;
import com.example.proba.entity.UserRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRolesService {
    @Autowired
    private UserRolesDao userRolesDao;
    public void testInit(UserRoles.Role role){

    UserRoles userRoles = new UserRoles();
    userRoles.setRoles(role);
    userRolesDao.save(userRoles);

    }
}
