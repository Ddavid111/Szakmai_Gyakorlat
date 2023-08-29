package com.example.proba.dao;

import com.example.proba.entity.UserRoles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesDao extends CrudRepository<UserRoles, Integer> {
}
