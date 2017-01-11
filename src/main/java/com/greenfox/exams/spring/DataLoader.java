package com.greenfox.exams.spring;

import com.greenfox.exams.spring.models.Project;
import com.greenfox.exams.spring.services.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Zsuzska on 2017. 01. 11..
 */
@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    ProjectRepo repo;

    @Override
    public void run(String... strings) throws Exception {
        repo.save(new Project("Clash of Zerda", "android"));
        repo.save(new Project("Clash of Zerda", "spring"));
        repo.save(new Project("Zerda Reader", "android"));
        repo.save(new Project("Zerda Reader", "spring"));
        repo.save(new Project("Konnekt Contact Manager", "spring"));
    }
}