package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {
    //localhost:8080/student/register
//    @RequestMapping(value = "/register", method = RequestMethod.GET)
   @GetMapping("register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudents());

       return "student/register";
    }

    //localhost:8080/student/drop
    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    @PostMapping("/welcome")
    public String welcome(@RequestParam String name){

        return "student/welcome";
    }

//    @RequestMapping("/welcome/{name}")
//    public String welcome2(@PathVariable String name){
//
//        return "student/welcome";
//    }

}
