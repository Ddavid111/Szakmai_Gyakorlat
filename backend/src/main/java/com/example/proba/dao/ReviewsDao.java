package com.example.proba.dao;

import com.example.proba.entity.Reviews;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsDao extends CrudRepository<Reviews, Integer> {
}
