package com.springjdbc.service;

import com.springjdbc.dao.employeeDao;
import com.springjdbc.model.Employee;

import java.util.List;

public interface employeService {
     public List<Employee>getAll();
     public  void addEmployees(Employee employee);
     public  void deleteEmployees(Employee employee);
     public  void updateEmployees(Employee employee);
     public  void searchEmployees(Employee employee);
}
