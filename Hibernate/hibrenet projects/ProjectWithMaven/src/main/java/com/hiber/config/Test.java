package com.hiber.config;
//for student class

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println("project started");
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //alternative for above statements
        //  SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        // creating student
        Student s = new Student(112, "johjjn", "ahmednager");
        System.out.println(s);

        //creating address classs object
        Address address = new Address();
        address.setStreet("street1");
        address.setCity("mumbai");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(1234.545);

        System.out.println(address);
        //READING FILE image
        FileInputStream fis = new FileInputStream("src/main/resources/myimg.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        address.setImage(data);


        System.out.println(address);
        //getting current session and it returns session object
        Session session = sessionFactory.openSession();
        // start transcation
        //    session.beginTransaction();//alternative below
        Transaction tx = session.beginTransaction();
        //saveing data
        session.save(s);

        session.save(address);
        //  session.getTransaction().commit();// alternative below
        tx.commit();
        session.close();
        System.out.println("done");
    }
}
