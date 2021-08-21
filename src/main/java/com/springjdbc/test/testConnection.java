package com.springjdbc.test;

import com.springjdbc.daoImp.employeeImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.jdbc.core.JdbcTemplate;

public class testConnection {
    @Autowired
    private  JdbcTemplate jdbcTemplate;
    public static void main(String[] args) {
        testConnection connection=new testConnection();
        DataSourceProperties properties =new DataSourceProperties();
        System.out.println(properties.getUsername());
        System.out.println(properties.getPassword());
        System.out.println(properties.getUrl());

    }
}
