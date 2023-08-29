package com.example.proba.service;

import com.example.proba.dao.UserRolesDao;
import com.example.proba.dao.UsersDao;
import com.example.proba.entity.UserRoles;
import com.example.proba.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    private UsersDao usersDao;

    @Autowired
    private UserRolesDao userRolesDao;
   // private EntityManager entityManager;

    public Users testInit(String email, String password, Integer title, String firstName, String familyName, LocalDate birthday)
    {


     //   UserRoles userRoles = new UserRoles();
        Users users = new Users();
        users.setEmail(email);
        users.setPassword(password);
        users.setTitle(title);
        users.setFirstName(firstName);
        users.setFamilyName(familyName);
        users.setBirthday(birthday);
   //     userRoles.setRoles(UserRoles.Role.Elnok);
        users.setRoles(UserRoles.Role.Elnok);
    //    userRoles.setUsers(users);
      //  userRolesDao.save(userRoles);
        //System.out.println(usersDao.save(users).getId());
        return usersDao.save(users);
       // return userRolesDao.save(userRoles);
    }

    public void testSelect(){
        List<Users> users = (List<Users>) usersDao.findAll();
        for (Users u : users) {
        System.out.println(u);
        }

    }

    public List<Users> findAllUsers(){



        return (List<Users>) usersDao.findAll();
    }

    public Optional<Users> findUserById (Integer id) {

        return usersDao.findById(id);
    }

    public void deleteAllUsers(){
        usersDao.deleteAll();
    }



}
