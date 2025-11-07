package com.kodnest.exceptionhandler.intro;

import java.util.Scanner;

public class ATM {
	Scanner sc = new Scanner(System.in);

	void User() throws Exception {
		System.out.println("welcome to atm... connected to db");
		
		try { 
			 int amt = sc.nextInt();
			 int bal = 5000;
			 if(amt>100 && amt <= bal)
		    	 System.out.println("Rs " + amt + " is successfully withdrawn");
			
		     int curr = bal-amt;
		     int pass = 1234;
		     int b = sc.nextInt();
		     if(b == pass)
			 System.out.println("Rs "+curr+  " is available balance"); 
		     
		   
		    } 
		catch(Exception e) {
			 System.out.println("Insufficient balance Or error Occured...");
			 throw e;
		    } 
	
		finally {
			System.out.println("Transaction cancelled...");
		}
  }
	
}
