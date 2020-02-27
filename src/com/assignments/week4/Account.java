package com.assignments.week4;

public class Account {

    private String id = "00000000";
    private double balance = 0.0;
    private String name = "";
    private String address = "";

    public Account() {

    }

    public Account(String id, double balance, String name, String address) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.address = address;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
         this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void clear() {
        this.balance = 0.0;
    }

    public static void main(String[] args) {
        Account a1 = new Account("00455420",
                100.50,
                "John Doe",
                "3534 Valley St. NE Minneapolis MN 55418"
        );
        System.out.println(a1.getBalance());
        a1.withdraw(4.50);
        System.out.println(a1.getBalance());
        a1.deposit(7.75);
        System.out.println(a1.getBalance());
        a1.clear();
        System.out.println(a1.getBalance());
    }
}
