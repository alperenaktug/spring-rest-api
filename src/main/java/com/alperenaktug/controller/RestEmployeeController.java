package com.alperenaktug.controller;

import com.alperenaktug.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alperenaktug.services.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

     @GetMapping("/employee-list")
    public List<Employee> getAllEmployeesList() {

         employeeService.getAllEmployeesList();

        return employeeService.getAllEmployeesList();
    }
}
