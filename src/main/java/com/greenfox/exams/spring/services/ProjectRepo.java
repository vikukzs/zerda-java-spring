package com.greenfox.exams.spring.services;

import com.greenfox.exams.spring.models.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Zsuzska on 2017. 01. 11..
 */
public interface ProjectRepo extends CrudRepository<Project, Long>{
}
