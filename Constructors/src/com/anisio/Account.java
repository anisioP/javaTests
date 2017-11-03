package com.anisio;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAdress;
    private String customerPhoneNumber;

    public Account(){
        this("1234556", 10000.00, "André Pinheiro", "andrepinheiro@gmail.com", "(351) 917197673");
        System.out.println("Empty constructer used");
    }

    public Account(String number, double balance,String customerName, String customerEmailAdress, String customerPhoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAdress = customerEmailAdress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAdress, String customerPhoneNumber) {
        this.number = "999999999";
        this.balance = 0.00;
        this.customerName = customerName;
        this.customerEmailAdress = customerEmailAdress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account (Account account){
        this.number = account.number;
        this.balance = account.balance;
        this.customerName = account.customerName;
        this.customerEmailAdress = account.customerEmailAdress;
        this.customerPhoneNumber = account.customerPhoneNumber;
    }

    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposite performed, current balance is: " + this.balance);
    }

    public void withdrawal (double withdrawalAmmount){
        if (this.balance - withdrawalAmmount <= 0){
            System.out.println("There is not enough balance to perform the operation");
        }
        else {
            this.balance -=withdrawalAmmount;
            System.out.println("Withdrawal of: " + withdrawalAmmount + " Euros performed, current balance is: " + this.balance + " Euros");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
