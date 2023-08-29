package com.example.proba.dao;

import com.example.proba.entity.Semesters;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestersDao extends CrudRepository<Semesters, Integer> {
}
