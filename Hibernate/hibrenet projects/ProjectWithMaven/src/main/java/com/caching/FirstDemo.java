package com.caching;

import com.HQL.StudentHQL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        StudentHQL studentHQL= session.get(StudentHQL.class,12123432);
        System.out.println(studentHQL);

        System.out.println("working something");

        StudentHQL studentHQL1=session.get(StudentHQL.class,12123432);
        System.out.println(studentHQL1);
        System.out.println(session.contains(studentHQL1));// for checking object store in cache or not
        session.close();
    }

}
