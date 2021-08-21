package com.springjdbc.serviceImp;

import com.springjdbc.dao.employeeDao;
import com.springjdbc.model.Employee;
import com.springjdbc.service.employeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeServiceImp implements employeService {

    @Autowired
    private employeeDao employeeDao;
    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public void addEmployees(Employee employee) {
            employeeDao.addEmployee(employee);
    }
    @Override
    public void deleteEmployees(Employee employee) {
            employeeDao.deleteEmployee(employee);
    }

    @Override
    public void updateEmployees(Employee employee) {
           employeeDao.updataEmployee(employee);
    }

    @Override
    public void searchEmployees(Employee employee) {
           employeeDao.updataEmployee(employee);
    }
}
