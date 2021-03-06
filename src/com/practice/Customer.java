package com.practice;

import java.util.ArrayList;

public class Customer {
    private ArrayList<ShippingAddress> Addresses;
    private String name;
    private int customerID;
    private static int nextID = 1000;

    public Customer(){
        customerID = nextID;
        nextID +=1;
    }

    public String getName(){
        return name;
    }

    public void addAddress (ShippingAddress newAddress){
        Addresses.add(newAddress);
    }

    public String toString(){
        var customer = name + Addresses;
        String customer1 = customer;
        return customer1;
    }
}
