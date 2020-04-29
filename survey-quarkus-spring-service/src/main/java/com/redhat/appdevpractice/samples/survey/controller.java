package com.redhat.appdevpractice.samples.survey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/surveygroup")
public class controller {

    @GetMapping
    public String hello() {
        return "hello";
    }
}