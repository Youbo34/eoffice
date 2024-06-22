package com.example.eoffice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//import com.example.eoffice.eoffice.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

    @Override
    public String createEmployee(Employee employee) {
        employees.add(employee);
        return "Employee created successfully";
    }

    public EmployeeServiceImpl() {
    }

    @Override
    public List<Employee> readEmployees() {
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        return employees.removeIf(employee -> employee.getId().equals(id));
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
