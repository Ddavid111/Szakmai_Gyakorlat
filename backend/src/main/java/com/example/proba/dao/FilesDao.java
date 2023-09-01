package com.example.proba.dao;

import com.example.proba.entity.File;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilesDao extends CrudRepository<File, Integer> {
}
