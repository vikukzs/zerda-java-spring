package com.greenfox.exams.spring.models;

import com.greenfox.exams.spring.check.CheckEmail;
import com.greenfox.exams.spring.check.CheckExperience;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by Zsuzska on 2017. 01. 11..
 */
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @CheckExperience
    private String experience;
    @Min(10)
    private int rating;
    @NotNull
    @CheckEmail
    private String email;

    public Answer(){}

    public Answer(String experience, int rating, String email) {
        this.experience = experience;
        this.rating = rating;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
