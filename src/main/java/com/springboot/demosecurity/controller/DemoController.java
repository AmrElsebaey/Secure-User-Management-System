package com.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/showMyLoginPage")
    public String showForm(){
        return "login-form";
    }


    @GetMapping("/leaders")
    public String showLeaders(){
        return "leaders";
    }
    @GetMapping("/systems")
    public String showAdmins(){
        return "admins";
    }

    @GetMapping("/access-denied")
    public String showAccessDenied(){
        return "access-denied";
    }
}
