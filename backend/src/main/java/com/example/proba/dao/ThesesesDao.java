package com.example.proba.dao;

import com.example.proba.entity.Theseses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThesesesDao extends CrudRepository<Theseses, Integer> {
}
