package com.kodnest.multithreading.join;

public class Tasks implements Runnable{
	
	 public void run() {
		 System.out.println("Printing Activity Started");
		 for(int i = 1; i < 5; i++) {
			 try {
				 Thread.sleep(1000);
			 }
			 catch (InterruptedException e){
				e.printStackTrace();
			 }
			 System.out.println("Kodnest");
		 
		 if(Thread.currentThread().isInterrupted()) {
			 System.out.println("Stopped");
			 return;
		 }
		 }
		 System.out.println("Printing Activity Ended");
	 }

}
