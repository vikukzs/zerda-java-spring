package com.greenfox.exams.spring.check;

import com.greenfox.exams.spring.models.Answer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

/**
 * Created by Zsuzska on 2017. 01. 11..
 */
public class CheckEmailV implements ConstraintValidator<CheckEmail, String> {
    Answer answer;

    @Override
    public void initialize(CheckEmail constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (answer.getEmail().contains("@") && answer.getEmail().contains(".")){
            return true;
        }
        return false;
    }
}
