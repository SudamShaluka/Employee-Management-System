package com.ijse.ems.mapper;

import com.ijse.ems.dto.EmployeeDto;
import com.ijse.ems.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto (Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastname(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
