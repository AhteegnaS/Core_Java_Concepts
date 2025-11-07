package com.kodnest.multithreading.join;

import java.util.Scanner;

public class Task implements Runnable {
	@Override
	 public void run() {
		String tname = Thread.currentThread().getName();
		if(tname.equals("Bank")) {
			banking();
		} else if(tname.equals("Print")){
			printing();
		}
		else {
			adding();
		}
	 }
	 
	 public void banking() {
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
	 
	 
	 public void printing() {
		 System.out.println("Printing Activity Started");
		 for(int i = 1; i < 5; i++) {
			 try {
				 System.out.println("Kodnest");
				 Thread.sleep(5000);
			 }
			 catch (Exception e){
				 e.printStackTrace();
			 }
		 }
		 System.out.println("Printing Activity Ended");
	 }
	 
	 public void adding() {
		 System.out.println("Addition activity started");
		 
		 try {
			 int a = 1234;
			 int b = 6789;
			
			 System.out.println(a+b);
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 System.out.println("Addition activity ended");
	 }


}
