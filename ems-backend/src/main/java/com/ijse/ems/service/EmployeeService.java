package com.ijse.ems.service;

import com.ijse.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee (EmployeeDto employeeDto) ;
    EmployeeDto getEmployeeById(Long employeeId) ;
    List<EmployeeDto> getAllEmployees() ;
    EmployeeDto updateEmployee(Long EmployeeId, EmployeeDto updatedEmployee) ;
    void deleteEmployee(Long employeeId);
}
