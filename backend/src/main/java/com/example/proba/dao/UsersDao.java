package com.example.proba.dao;

import com.example.proba.entity.Titles;
import com.example.proba.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDao extends CrudRepository<Users, Integer> {
}
