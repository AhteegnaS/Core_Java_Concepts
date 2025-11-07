package com.kodnest.exceptionhandler.intro;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
	   try {
       System.out.println("Enter two numers for division:");
       int a =  sc.nextInt();
       int b = sc.nextInt();
       int c = a / b;
       System.out.println("result is : " + c);
	  }
	   catch(Exception e) {
		   System.out.println("infinity");
	   }
	   System.out.println("Program executed sucessfully");
	   sc.close();
	}

}
