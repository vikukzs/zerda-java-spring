package com.greenfox.exams.spring.services;

import com.greenfox.exams.spring.models.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Zsuzska on 2017. 01. 11..
 */
@Service
public class AnswerService  {
    AnswerRepo repository;

    @Autowired
    public AnswerService(AnswerRepo repository) {
        this.repository = repository;
    }
    public void save(Answer input) {
        repository.save(input);
    }



}
