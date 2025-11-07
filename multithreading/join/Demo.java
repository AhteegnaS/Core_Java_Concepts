package com.kodnest.multithreading.join;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Activity has started and connection to server established resources are allocated.");
		try {
		Task task = new Task();
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);
		
		t1.setName("Bank");
		t2.setName("Print");	
		t3.setName("Add");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		}
		catch (Exception e) {
			e.printStackTrace();		
		}
		System.out.println("Main Activity has ended and connection to server terminated resources are deallocated.");

	}

}
