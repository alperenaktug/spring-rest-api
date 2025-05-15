package com.alperenaktug.controller;

import com.alperenaktug.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alperenaktug.services.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

     @GetMapping(path = "/employee-list")
    public List<Employee> getAllEmployeesList() {

         employeeService.getAllEmployeesList();

        return employeeService.getAllEmployeesList();
    }
     @GetMapping(path = "/employee-list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id" , required = true ) String id) {
         return employeeService.getEmployeeById(id);
    }
}
