package com.kodnest.multithreading.intro;

import java.util.Scanner;

public class Banking extends Thread {
  public void run() {
	  Scanner sc = new Scanner(System.in);
		 System.out.println("Banking Activity Started");
		 String name = "Sangeetha";
		 String password = "12345";
		 
		 System.out.println("Enter Username and Password");
		 String username = sc.nextLine();
		 String userpassword = sc.nextLine();
		 
		 if(name.equals(username) && userpassword.equals(password)) {
			 System.out.println("take your money");
		 } else {
			 System.out.println("Cannot Dispatch");
			 
		 }
		 System.out.println("Banking activity ended");
		 sc.close();
  }
}
