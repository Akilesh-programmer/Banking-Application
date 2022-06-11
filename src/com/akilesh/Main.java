package com.akilesh;

public class Main {

    private static final Bank bank = new Bank();

    public static void main(String[] args) {
        bank.addNewBranch("Erode");
        bank.addNewBranch("Salem");
        bank.addNewBranch("Chennai");

        bank.addCustomer("Erode", "Akilesh", 100.0);
        bank.addCustomer("Erode", "Thilagavathi", 90.0);
        bank.addCustomer("Erode", "Saravanan", 80.0);

        bank.addCustomer("Salem", "Akilesh", 100.0);
        bank.addCustomer("Salem", "Thilagavathi", 90.0);
        bank.addCustomer("Salem", "Saravanan", 80.0);

        bank.addCustomer("Chennai", "Akilesh", 100.0);
        bank.addCustomer("Chennai", "Thilagavathi", 90.0);
        bank.addCustomer("Chennai", "Saravanan", 80.0);

        bank.addTransaction("Erode", "Akilesh", 1.0);
        bank.addTransaction("Erode", "Saravanan", 1.0);
        bank.addTransaction("Erode", "Thilagavathi", 1.0);

        bank.addTransaction("Chennai", "Akilesh", 1.0);
        bank.addTransaction("Chennai", "Saravanan", 1.0);
        bank.addTransaction("Chennai", "Thilagavathi", 1.0);

        bank.addTransaction("Salem", "Akilesh", 1.0);
        bank.addTransaction("Salem", "Saravanan", 1.0);
        bank.addTransaction("Salem", "Thilagavathi", 1.0);

        bank.showList("Erode", false);
        bank.showList("Erode", true);

        bank.showList("Salem", false);
        bank.showList("Salem", true);

        bank.showList("Chennai", false);
    }
}
