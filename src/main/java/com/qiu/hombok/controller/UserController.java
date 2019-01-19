package com.qiu.hombok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/showLogin")
    public String showLogin(){
        return "login";
    }

}
