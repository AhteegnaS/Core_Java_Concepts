package com.kodnest.multithreading.intro;

public class Main {
	public static void main(String[] args) {
		Tasks t1 = new Tasks();
		Tasks t2 = new Tasks();
		Tasks t3 = new Tasks();
		
		t1.setName("Bank");
		t2.setName("Print");
		t3.setName("Add");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
