package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorController {


        //localhost:8080/register
        @RequestMapping("/mentor/register")
        public String register(){
            return "student/register";
        }
}
