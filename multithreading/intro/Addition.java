package com.kodnest.multithreading.intro;

public class Addition extends Thread {
	public void run() {
		 System.out.println("Addition activity started");
		 
		 try {
			 int a = 1234;
			 int b = 6789;
			 Thread.sleep(5000);
			 System.out.println(a+b);
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 System.out.println("Addition activity ended");
	 }

}
