package ru.k2.pharmacy_hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.k2.pharmacy_hospital.domain.Person;
import ru.k2.pharmacy_hospital.service.PharmacyServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    private PharmacyServiceImpl service;

    @Autowired
    public UserController(PharmacyServiceImpl service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getUsers(Model uiMOdel) {
           List<Person> personList = service.findAll();
           uiMOdel.addAttribute("person",personList);
        return "list";
    }

}
