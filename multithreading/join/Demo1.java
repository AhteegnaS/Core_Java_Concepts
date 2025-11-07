package com.kodnest.multithreading.join;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Tasks task = new Tasks();
     
     Thread t = new Thread(task);
     
     
     try {
    	 t.start();
    	 Thread.sleep(3000);
    	 t.interrupt();
     } 
     catch (InterruptedException e) {
    	 e.printStackTrace();
     }
     System.out.println("Stopped cause you called interrupt()");
    
	}

}
