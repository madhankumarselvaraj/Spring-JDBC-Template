/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.jdbctemplate;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class MainApp {

public static void main(String[] args) {

    ApplicationContext apCnxt = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeDao empDao = (EmployeeDao) apCnxt.getBean("edao");
    int status = empDao.saveEmployee(new Employee(106, "Priya", 112000));
    if (status == 1) {
        System.out.println("Query Excuted Successfully");
    } else {
        System.out.println("Query Excuted Failed");
    }
    List<Employee> emp = empDao.getAllEmployee();
    for (Employee e : emp) {
        System.out.println(e);
    }

}
}
