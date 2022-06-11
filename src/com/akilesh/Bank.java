package com.akilesh;

import java.util.ArrayList;

public class Bank {

    private final ArrayList<Branch> branches = new ArrayList<>();

    public void addNewBranch(String name) {
        Branch branch = new Branch(name);
        branches.add(branch);
    }

    public int getIndexOfBranch(String name) {
        int index;
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(name)) {
                index = i;
                return index;
            }
        }
        System.out.println("No branch with the name " + name + " has been found.");
        return -1;
    }

    public void addCustomer(String branchName, String customerName, double initialTransaction) {
        int index = getIndexOfBranch(branchName);
        if (index > -1) {
            branches.get(index).addNewCustomer(customerName, initialTransaction);
        }
    }

    public void addTransaction(String branchName, String customerName, double transactionAmount) {
        int branchIndex = getIndexOfBranch(branchName);
        if (branchIndex > -1) {
            branches.get(branchIndex).addTransaction(customerName, transactionAmount);
        }
    }

    public void showList(String branchName, boolean withTransaction) {
        int branchIndex = getIndexOfBranch(branchName);
        boolean validBranchIndex = branchIndex > -1;
        Branch branch = branches.get(branchIndex);
        ArrayList<Customer> customers = branch.getCustomers();
        if (validBranchIndex && !withTransaction) {
            for (Customer customer : customers) {
                System.out.println(customer.getName());
            }
        } else if (validBranchIndex) {
            for (Customer customer : customers) {
                System.out.println("Name: " + customer.getName());
                System.out.println("Transactions: ");
                ArrayList<Double> transactions = customer.getTransactions();
                for (Double transaction : transactions) {
                    System.out.println(transaction);
                }
            }
        }
    }
}
