package com.example.demo;

public class EmployeeReq {
    String id;
    String name;
    EmployeeReq(){

    }
    EmployeeReq(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
