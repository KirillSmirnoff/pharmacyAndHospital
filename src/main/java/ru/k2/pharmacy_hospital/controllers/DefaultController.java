package ru.k2.pharmacy_hospital.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//нужно что нибудь прилумать для коммита

@Controller
@RequestMapping("/")
public class DefaultController {

    @GetMapping("/")
    public String start(Model uiModel){
        return "starter";
    }

    @GetMapping("login")
    public  String login(){
        return "login";
    }
}
