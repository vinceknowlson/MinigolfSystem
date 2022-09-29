package com.example.minigolfsystem;

public class Employee extends User{

    public Employee(String fName, String sName, String email, String password) {
        super(fName, sName, email, password);
    }

    public String getType() {return "employee";}

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", sName='" + sName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
