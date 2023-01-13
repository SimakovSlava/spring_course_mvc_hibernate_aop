package com.simakov.spring.mvc_hibernate_aop.Controller;

import com.simakov.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.simakov.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MuController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    public String showAllEmployees(Model model){

        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmpls", allEmployees);
        return "all-employees";
    }
}
