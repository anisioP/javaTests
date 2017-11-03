package com.anisio;

public class Main {

    public static void main(String[] args) {
	Account andreAccount = new Account("1234556", 10000.00, "André Pinheiro", "andrepinheiro@gmail.com", "(351) 917197673");
	andreAccount.withdrawal(100.00);
	andreAccount.deposit(20000.00);
    }
}
