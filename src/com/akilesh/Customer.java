package com.akilesh;

import java.util.ArrayList;

public class Customer {

    private final ArrayList<Double> transactions = new ArrayList<>();
    private final String name;

    public Customer(String name, double initialTransactionAmount) {
        this.name = name;
        transactions.add(initialTransactionAmount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double transactionAmount) {
        transactions.add(transactionAmount);
    }
}
