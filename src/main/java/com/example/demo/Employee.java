package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/emp/v1")

public class Employee {

    @Autowired
    IEmployeeService iEmployeeService;
    @PostMapping("/addEmp")
    public ResponseEntity<EmployeeReq> addEmployee(@RequestBody EmployeeReq employeeReq){
        return ResponseEntity.ok(iEmployeeService.addEmployee(employeeReq));

    }

    @GetMapping("/getEmp/{id}")
    public ResponseEntity<EmployeeReq> getEmployee(@PathVariable String id){
        return ResponseEntity.ok(iEmployeeService.getEmployee(id));

    }

    @DeleteMapping("/delEmp/{id}")
    public ResponseEntity<Boolean> delEmployee(@PathVariable String id){
        return ResponseEntity.ok(iEmployeeService.deleteEmployee(id));

    }
}
