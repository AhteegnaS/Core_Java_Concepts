package com.kodnest.retriveData;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	Scanner sc =  new Scanner(System.in);
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        SessionFactory factory = configuration.buildSessionFactory();
        //SessionFactory factory = new  configuration.configure("hibernate.cfg.xml").buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Employee e = session.get(Employee.class, sc.nextInt());
        
        System.out.println(e);
        sc.close();
        transaction.commit();
        session.close();
        factory.close();
    }
}
