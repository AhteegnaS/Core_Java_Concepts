package com.kodnest.updateData;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.updateData.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc =  new Scanner(System.in);
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        SessionFactory factory = configuration.buildSessionFactory();
        //SessionFactory factory = new  configuration.configure("hibernate.cfg.xml").buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Employee e = session.get(Employee.class, sc.nextInt());
        
        System.out.println(e);
        System.out.println("Enter name to update");
        String name = sc.next();
        e.setName(name);
        Employee updateEmployee = session.merge("Employee", e);
        System.out.println(updateEmployee);
        sc.close();
        transaction.commit();
        session.close();
        factory.close();
    }
}
