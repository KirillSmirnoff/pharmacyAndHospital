package ru.k2.pharmacy_hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.k2.pharmacy_hospital.domain.Person;
import ru.k2.pharmacy_hospital.service.PersonServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    private  PersonServiceImpl service;

    @Autowired
    public UserController(PersonServiceImpl service) {
        this.service = service;
    }

//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public String getUsers(Model uiMOdel) {
//           List<Person> personList = service.findAll();
//           uiMOdel.addAttribute("person",personList);
//        return "list";
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String getUsers(Model uiMOdel) {
//        Person personList = service.getPersonByName();
        uiMOdel.addAttribute("person",service.getPersonByName());
        return "starter";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String registerForm(Model uiModel){
        uiModel.addAttribute(new Person());
        return "/register";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String registerUser(Person person){
        service.savePerson(person);
        return "redirect:/" ;
    }

}
