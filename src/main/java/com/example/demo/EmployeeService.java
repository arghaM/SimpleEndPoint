package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements  IEmployeeService {
    Map<String, EmployeeReq> employeeCache = new HashMap<>();

    @Override
    public EmployeeReq addEmployee(final EmployeeReq employeeReq) {
        employeeCache.put(employeeReq.getId(),employeeReq);

        return employeeReq;
    }

    @Override
    public EmployeeReq getEmployee(final String empID) {
        return  employeeCache.get(empID);
    }

    @Override
    public boolean deleteEmployee(final String empid) {
        if(employeeCache.containsKey(empid)){
            employeeCache.remove(empid);
            return  true;
        }
        return  false;
    }
}
