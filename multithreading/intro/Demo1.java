package com.kodnest.multithreading.intro;
// if there is inheritence then go for implenting runnable
public class Demo1 {
	public static void main(String[] args) {
		Tasks tasks = new Tasks();
		
		Thread t1 = new Thread(tasks);
		Thread t2 = new Thread(tasks);
		Thread t3 = new Thread(tasks);
		
		
		t1.setName("Bank");
		t2.setName("Print");
		t3.setName("Add");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
