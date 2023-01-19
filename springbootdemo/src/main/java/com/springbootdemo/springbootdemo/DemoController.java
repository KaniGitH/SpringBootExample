package com.springbootdemo.springbootdemo;

import com.springbootdemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class DemoController {

    private String id;

    @GetMapping("/sample/{id}")
    public String sample(@PathVariable String id) {

        return "Sample my id = " + id;
    }

    @GetMapping("/demo")
    public String demo(@RequestParam int testid) {
        return "Demo " + testid;
    }

    @GetMapping
    public String empty() {
        return "empty";
    }

    @PostMapping("/setSampleData")
    public Employee setSample(int empId, String empName, String empDept) {
        Employee emp = new Employee(empId, empName, empDept);
        return emp;
    }

}
