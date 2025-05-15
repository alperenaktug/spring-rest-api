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
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("1","Alper" , "Aktuğ"));
        employeeList.add(new Employee("2","Furkan" , "Karatekin"));
        employeeList.add(new Employee("3","Umut" , "Akın"));
        employeeList.add(new Employee("4","Hakan" , "Altıparmak"));
        employeeList.add(new Employee("5","Tayyip" , "Felek"));



        return employeeList;
    }
}
