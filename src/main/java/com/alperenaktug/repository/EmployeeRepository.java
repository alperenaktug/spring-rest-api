package com.alperenaktug.repository;

import com.alperenaktug.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;


    public List<Employee> getAllEmployeesList(){

        return employeeList;
    }

}
