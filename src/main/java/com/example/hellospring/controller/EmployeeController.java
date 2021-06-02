package com.example.hellospring.controller;

import com.example.hellospring.entity.Employee;
import com.example.hellospring.model.dto.EmployeeDTO;
import com.example.hellospring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    // create
    @PostMapping()
    public EmployeeDTO create (@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    // find all
    @GetMapping()
    public List<EmployeeDTO> findAll (){
        return employeeService.findAll();
    }
}
