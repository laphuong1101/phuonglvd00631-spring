package com.example.hellospring.service;

import com.example.hellospring.entity.Employee;
import com.example.hellospring.model.dto.EmployeeDTO;
import com.example.hellospring.model.mapper.EmployeeMapper;
import com.example.hellospring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // save
    public EmployeeDTO save (Employee employee) {
        employeeRepository.save(employee);
        EmployeeDTO rs = EmployeeMapper.employeeDTO(employee);
        return rs;
    }

    // find all
    public List<EmployeeDTO> findAll () {
        List<EmployeeDTO> studentDTOS = new ArrayList<>();
        List<Employee> employees = employeeRepository.findAll();
        for (Employee item : employees) {
            studentDTOS.add(EmployeeMapper.employeeDTO(item));
        }
        return studentDTOS;
    }
}
