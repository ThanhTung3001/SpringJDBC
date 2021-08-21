package com.springjdbc.daoImp;

import com.springjdbc.dao.employeeDao;
import com.springjdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@org.springframework.transaction.annotation.Transactional
@Repository
@Component
public class employeeImp implements employeeDao {
    @Autowired
    public JdbcTemplate jdbcTemplate;
    @Override
    public List<Employee> getAll() {
        String sql;
        sql = "Select*from employee";
        return jdbcTemplate.query(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                   Employee employee =new Employee();
                   employee.setId(rs.getInt("id"));
                   employee.setName(rs.getString("name"));
                   employee.setAge(rs.getInt("age"));
               return employee;
            }
        });
    }

    @Override
    public void addEmployee(Employee employee) {

    }
    @Override
    public void deleteEmployee(Employee employee) {

    }
    @Override
    public void updataEmployee(Employee employee) {

    }
    @Override
    public void searchEmployee(Employee employee) {

    }
}
