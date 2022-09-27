package com.hiber.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

//for emp table//saving data
public class EmpTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Emp e = new Emp(16, "ram", "pune");
        Emp e2 = new Emp(17, "tanu", "nagpur");

        System.out.println(e);
        System.out.println(e2);
        EmpAddress ee = new EmpAddress();
        ee.setEmpId(201);
        ee.setName("pranali gawade");
        ee.setCity("d-raja");
        ee.setStreet("mumbai");
        ee.setX(20);
        ee.setIsopen(true);
        ee.setAddedDate(new Date());
        System.out.println(ee);
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/myimg.jpg");
            byte[] data = new byte[fis.available()];
            fis.read(data);
            ee.setImg(data);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        //    System.out.println(ee);
        // System.out.println(ee.getImg());
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Transaction T = session.getTransaction();
        session.save(ee);
        session.save(e2);
        session.save(e); // for emp class// save the session
       // session.saveOrUpdate(e2);//calls either save or update  on basis of identifer exits or not.

        // for emp address class
        T.commit();

        session.close();
        sessionFactory.close();
    }
}
