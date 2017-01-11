package com.greenfox.exams.spring.controllers;

import com.greenfox.exams.spring.models.Answer;
import com.greenfox.exams.spring.services.AnswerService;
import com.greenfox.exams.spring.services.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by Zsuzska on 2017. 01. 11..
 */
@Controller
@RequestMapping("/welcome")
public class AnswerController {

    @Autowired
    private AnswerService service;

    @Autowired
    private ProjectRepo repo;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listAnswers(Model model){
        model.addAttribute("answer", new Answer());
        return "welcome";
    }


    @PostMapping("")
    public String addNewInput(@Valid Answer input, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "welcome";
        }
        service.save(input);
        return "redirect:welcome/thanks";
    }

    @GetMapping("/thanks")
    public String thanks(Model model) {
        model.addAttribute("thanks", repo.findAll());
        return "thanks";
    }

}
