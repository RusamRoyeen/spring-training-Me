package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage() {  //which end point? www.amazon.com/login
        return "home.html";
    }

    @RequestMapping("/ozzy")
    public String getHomePage2() {  //which end point? www.amazon.com/lo  gin
        return "home.html";
    }

    @RequestMapping//nothing
    public String getHomePage3() {  //which end point? www.amazon.com/login
        return "home.html";
    }

    @RequestMapping({"/apple", "/orange"})
    public String getHomePage4() {
        return "home.html";
    }

}
