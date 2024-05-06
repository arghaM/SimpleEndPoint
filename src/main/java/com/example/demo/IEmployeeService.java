package com.example.demo;


public interface IEmployeeService {

    public EmployeeReq addEmployee(EmployeeReq employeeReq);
    public EmployeeReq getEmployee(String empID);
    public boolean deleteEmployee(String empID);

}
