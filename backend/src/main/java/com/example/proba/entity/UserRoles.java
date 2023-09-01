package com.example.proba.entity;

import jakarta.persistence.*;


@Entity
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    @ManyToOne
    @JoinColumn(name = "userId",insertable = false,updatable = false)
    Users users;
    @Enumerated(EnumType.ORDINAL)
    private Role roles;
    public enum Role{
    Hallgato,
    Elnok,
    Jegyzo,
    Biralo,
    Temavezeto

}

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }

    /*public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }*/
}
