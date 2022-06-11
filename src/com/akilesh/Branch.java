package com.akilesh;

import java.util.ArrayList;

public class Branch {

    private final ArrayList<Customer> customers = new ArrayList<>();

    private final String name;

    public Branch(String name) {
        this.name = name;
    }

    public void addNewCustomer(String name, double initialTransactionAmount) {
        Customer customer = new Customer(name, initialTransactionAmount);
        customers.add(customer);
    }

    public void addTransaction(String name, double transactionAmount) {
        int index = findIndexOfName(name);
        if (index > -1) {
            customers.get(index).addTransaction(transactionAmount);
        }
    }

    public int findIndexOfName(String name) {
        int index;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
                index = i;
                return index;
            }
        }
        System.out.println("No customer with the name " + name + " has been found.");
        return -1;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
         return customers;
    }
}
