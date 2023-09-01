package com.example.proba.entity;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "users", cascade = CascadeType.ALL)
    Set<UserRoles> roles;

    /*@OneToMany(mappedBy = "reviews")
    Set<Reviews> reviews;*/
    
    private String email;
    private String password;
    private Integer title;
    private String firstName;
    private String familyName;
    private LocalDate birthday;
    //sql-es datet importáld!!!

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", roles=" + roles +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", title=" + title +
                ", firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", birthday=" + birthday +
                '}';
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Set<UserRoles> getRoles() {
        return roles;
    }

    public void setRoles(UserRoles.Role roles) {
        Set<UserRoles> userRoles = new HashSet<>();
      //  userRoles.add();
        this.roles = userRoles;
    }
}
