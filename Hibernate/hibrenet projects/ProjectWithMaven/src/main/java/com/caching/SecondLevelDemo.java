package com.caching;

import com.HQL.StudentHQL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelDemo {
    public static void main(String[] args) {
        SessionFactory factory= new Configuration().configure().buildSessionFactory();
        Session session1=factory.openSession();
        //first

       StudentHQL s1=session1.get(StudentHQL.class,12123432);
        System.out.println(s1);
        session1.close();
       Session session2=  factory.openSession();
       //second
        StudentHQL s2=session2.get(StudentHQL.class,12123432);
        System.out.println(s2);
       session2.close();
    }
}
