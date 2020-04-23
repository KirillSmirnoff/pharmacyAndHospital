package ru.k2.pharmacy_hospital.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.k2.pharmacy_hospital.domain.Drug;
import ru.k2.pharmacy_hospital.service.DrugServiceImpl;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/drug")
public class DrugController {

    private DrugServiceImpl drugService;

    @Autowired
    public void setDrugService(DrugServiceImpl drugService) {
        this.drugService = drugService;
    }

    @GetMapping("/list")
    public String getDrug(Model uiModel){
        List drugs = drugService.findAll();
        uiModel.addAttribute("drugs",drugs);
        return "drug-search";
    }

    @GetMapping("search")
    public String getDrugByName(@RequestParam("search") String s, Model uiModel){
        List drugs = drugService.getDrugByName(s);
        uiModel.addAttribute("drugs",drugs);
        return "drug-search";
    }

    @GetMapping("{id}")
    public String deleteDrug(@PathVariable("id") long id){
        drugService.deleteDrug(id);
        return "redirect: /drug/list";
    }

    @GetMapping("/create")
    public String createDrugForm(Model uiModel){
        uiModel.addAttribute(new Drug());
        return "create-drug";
    }

    @PostMapping("/create")
    public  String createDrug(Drug drug){
        drugService.saveDrug(drug);
        return "redirect: /drug/list";
    }

    @GetMapping("/edit/{id}")
    public String editDrugForm(@PathVariable("id") long id, Model uiModel){
        uiModel.addAttribute("drug", drugService.getDrugById(id));
        return "drug-update";
    }

    @PostMapping("edit/{id}")
    public String editDrug(Drug drug){
        drugService.saveDrug(drug);
        return "redirect: /drug/list";
    }

}
