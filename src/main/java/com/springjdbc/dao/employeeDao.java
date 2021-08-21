package com.springjdbc.dao;

import com.springjdbc.model.Employee;

import java.util.List;

public interface employeeDao {
    public  List<Employee>getAll();
    public void addEmployee(Employee employee);
    public void deleteEmployee( Employee employee);
    public void updataEmployee(Employee employee);
    public void searchEmployee(Employee employee);

}
