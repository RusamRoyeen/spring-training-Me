package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentController {
    //localhost:8080/mentor/register
    @RequestMapping("/student/register")
    public String register(){
       return "student/register";
    }
}
