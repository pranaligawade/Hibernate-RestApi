package com.XmlMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction tx= session.beginTransaction();
        Person person= new Person(211,"priya","delhi","22323144234");
        Person person2= new Person(215,"jiya","delhi","22323144234");
        Person person3= new Person(216,"triya","delhi","22323144234");

         BookDemo bookDemo= new BookDemo(114,"ikai","adsfs");
        BookDemo bookDemo1= new BookDemo(122,"ikai","adsfs");
        BookDemo bookDemo2= new BookDemo(113,"ikai","adsfs");

        session.save(person);
        session.save(person2);
        session.save(person3);

        session.save(bookDemo);
        session.save(bookDemo1);
        session.save(bookDemo2);
        tx.commit();
        session.close();
        sessionFactory.close();
    }
}

