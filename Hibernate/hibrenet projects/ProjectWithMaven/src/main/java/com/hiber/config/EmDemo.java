package com.hiber.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Student s1= new Student();
        s1.setStudId(145);
        s1.setName("damuhg");
        s1.setCity("pune");
        Certificate c= new Certificate();
        c.setCourse("os");
        c.setDuration("1hours");
        s1.setCertificate(c);
        System.out.println(s1);

        Student s2= new Student();
        s2.setStudId(198);
        s2.setName("piud");
        s2.setCity("pune");
        Certificate c1= new Certificate();
        c1.setCourse("dsu");
        c1.setDuration("1hours");
        s2.setCertificate(c);
        System.out.println(s2);

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Transaction t= session.getTransaction();

        //object save
        session.save(s1);
        session.save(s2);


        t.commit();
        session.close();
        sessionFactory.close();
    }
}
