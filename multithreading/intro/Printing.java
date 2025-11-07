package com.kodnest.multithreading.intro;

public class Printing extends Thread {
	public void run() {
	 System.out.println("Printing Activity Started");
	 for(int i = 1; i < 5; i++) {
		 try {
			 System.out.println("Kodnest");
		 }
		 catch (Exception e){
			 e.printStackTrace();
		 }
	 }
	 System.out.println("Printing Activity Ended");
	}
}
