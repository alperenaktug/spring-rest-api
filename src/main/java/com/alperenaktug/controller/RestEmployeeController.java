package com.alperenaktug.controller;

import com.alperenaktug.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.alperenaktug.services.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

     @GetMapping(path = "/list")
    public List<Employee> getAllEmployeesList() {

         employeeService.getAllEmployeesList();

        return employeeService.getAllEmployeesList();
    }
     @GetMapping(path = "/list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id" , required = true ) String id) {
         return employeeService.getEmployeeById(id);
    }

    @GetMapping(path = "/with-params")
    public List<Employee> getEmployeesWithParams(@RequestParam(name = "firstName" , required = false) String firstName ,
                                                  @RequestParam(name = "lastName" , required = false) String lastName){
        System.out.println(firstName + " " + lastName);
       return employeeService.getEmployeeWithParams(firstName, lastName);
    }
}


















