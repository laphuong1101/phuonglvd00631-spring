package com.example.hellospring.model.mapper;

import com.example.hellospring.entity.Employee;
import com.example.hellospring.model.dto.EmployeeDTO;

public class EmployeeMapper {
    public static EmployeeDTO employeeDTO (Employee employee) {
        EmployeeDTO tmp = new EmployeeDTO();
        tmp.setId(employee.getId());
        tmp.setName(employee.getName());
        tmp.setWage(employee.getWage());

        return tmp;
    }
}
