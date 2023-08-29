package com.example.proba.dao;

import com.example.proba.entity.Titles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitlesDao extends CrudRepository<Titles, Integer> {
}
