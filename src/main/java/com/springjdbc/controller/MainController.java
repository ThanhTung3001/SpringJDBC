package com.springjdbc.controller;

import com.springjdbc.daoImp.employeeImp;
import com.springjdbc.model.Employee;
import com.springjdbc.service.employeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private employeService employeService;
    @RequestMapping("/employee")
    public  String employeeReturn(Model model){
        List<Employee> employeeList = employeService.getAll();
        model.addAttribute("employList",employeeList);
        return  "employee";
    }
    @RequestMapping("/home")
    public  String HomeUser(Model model){
        return "home";
    }
}
