package com.alperenaktug.config;

import com.alperenaktug.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","Alper" , "free"));
        employeeList.add(new Employee("2","Furkan" , "Karatekin"));
        employeeList.add(new Employee("3","Umut" , "Akin"));
        employeeList.add(new Employee("4","Hakan" , "Altiparmak"));
        employeeList.add(new Employee("5","Tayyip" , "Felek"));
        employeeList.add(new Employee("6","Alper" , "Onal"));
        employeeList.add(new Employee("7","Tayyip" , "free"));



        return employeeList;
    }
}
