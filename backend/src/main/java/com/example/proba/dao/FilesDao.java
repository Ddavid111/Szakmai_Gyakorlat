package com.example.proba.dao;

import com.example.proba.entity.Files;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilesDao extends CrudRepository<Files, Integer> {
}
