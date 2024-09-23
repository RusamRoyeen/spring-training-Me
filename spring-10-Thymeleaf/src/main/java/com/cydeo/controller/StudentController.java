package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
    //localhost:8080/student/register
    @RequestMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudents());

       return "student/register";
    }

    //localhost:8080/student/drop
    @RequestMapping("/welcome")
    public String welcome(){

        return "student/welcome";
    }
}
