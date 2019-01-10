package com.ipiecoles.java.mdd050.controller;

import com.ipiecoles.java.mdd050.model.Employe;
import com.ipiecoles.java.mdd050.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employes")
public class EmployeController {

    @Autowired
    private EmployeRepository employeRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/count")
    public long countEmployes(){
        return employeRepository.count();
    }

    @RequestMapping("/{id}")
    public Employe findById(@PathVariable("id") Long id) {
        return employeRepository.findOne(id);
    }
}
