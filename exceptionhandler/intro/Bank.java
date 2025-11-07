package com.kodnest.exceptionhandler.intro;

public class Bank {
	void Initiate() {
	System.out.println("Connection to Bank Server is Secured...");
	ATM atm = new ATM();
	try {
		atm.User();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Connection to Bank Server is terminated");
	}
}
