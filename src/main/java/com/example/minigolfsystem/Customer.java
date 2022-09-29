package com.example.minigolfsystem;

public class Customer extends User{

    public Customer(String fName, String sName, String email, String password) {
        super(fName, sName, email, password);
    }

    public String getType() {return "customer";}
        @Override
        public String toString() {
            return "Customer{" +
                    "fName='" + fName + '\'' +
                    ", sName='" + sName + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }