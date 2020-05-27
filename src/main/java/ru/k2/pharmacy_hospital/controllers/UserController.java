package ru.k2.pharmacy_hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.k2.pharmacy_hospital.domain.Person;
import ru.k2.pharmacy_hospital.service.PersonServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/account")
public class UserController {

    private final PersonServiceImpl personService;

    @Autowired
    public UserController(PersonServiceImpl service) {
        this.personService = service;
    }

    @GetMapping("list")
    @Secured("ROLE_ADMIN")
    public String getUsers(Model uiModel) {
           List personList = personService.findAll();
           uiModel.addAttribute("person",personList);
        return "user-list";
    }

    @GetMapping("{id}")
    public String deletePerson(@PathVariable("id") Long id){
        personService.deletePerson(id);
        return "redirect: /account/list";
    }

    @GetMapping("/register")
    public String registerForm(Model uiModel){
        uiModel.addAttribute(new Person());
        return "user-register";
    }

    @PostMapping("/register")
    public String registerUser(Person person){
        personService.savePerson(person);
        return "redirect: /account/list" ;
    }

    @GetMapping("edit/{id}")
    public String editPersonForm(@PathVariable("id") Long id, Model uiModel){
        uiModel.addAttribute("person",personService.getPersonById(id));
        return "user-update";
    }

    @PostMapping("edit/{id}")
    public String editPerson(Person person){
        personService.savePerson(person);
        return "redirect: /account/list";
    }

//        @GetMapping("byname")   // МЕТОД НА БУДУЮЩЕЕ
//    public  String byname(@RequestParam("search") String s , Model model){
//        Person person = personService.getPersonById(Long.parseLong(s));
////        List person = personService.getPersonByName(s);
//            model.addAttribute("person",person);
//            return "starter";
//    }

}
