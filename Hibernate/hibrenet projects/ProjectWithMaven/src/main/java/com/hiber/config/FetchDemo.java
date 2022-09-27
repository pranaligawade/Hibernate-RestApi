package com.hiber.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        //get(),load()
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        //get-106(id)
        Student s = session.load(Student.class, 102);// used for fetching data//if object not found in db it returns ObjectNotFoundException.
        Address address = session.get(Address.class, 1);//used for fetching data//if object not found in db it returns null.

        System.out.println(s);
        System.out.println("street :" + address.getStreet() + " city:" + address.getCity());
        session.close();
        sessionFactory.close();
    }
}
