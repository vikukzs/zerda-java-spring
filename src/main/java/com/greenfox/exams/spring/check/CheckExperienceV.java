package com.greenfox.exams.spring.check;

import com.greenfox.exams.spring.models.Answer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Zsuzska on 2017. 01. 11..
 */
public class CheckExperienceV implements ConstraintValidator<CheckExperience, String> {
    Answer answer;

    @Override
    public void initialize(CheckExperience constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("amazing", "awesome", "blithesome", "excellent", "fabulous", "fantastic", "favorable", "fortuitous", "great", "incredible", "ineffable", "mirthful", "outstanding", "perfect", "propitious", "remarkable", "smart", "spectacular", "splendid", "stellar", "stupendous", "super", "ultimate", "unbelievable", "wondrous"));
        int counter = 0;
        for (int i = 0; i < words.size(); i++) {

            if (answer.getExperience().contains(words.get(i))) {
                counter++;
            }
        }
        if (counter < 3) {
            return false;
        }
        return true;
    }
}

