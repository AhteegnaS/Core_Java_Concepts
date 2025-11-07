package com.kodnest.exceptionhandler.intro;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connection to Main server is Secured Successfully...");
		Bank bank = new Bank();
		bank.Initiate();
		System.out.println("Connection to Main Server is Terminated...");

	}

}
