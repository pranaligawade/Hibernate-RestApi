package com.hiber.config;
// for testing  FEATCHING PROCESSS::load and get dATA FORM EMP ,EMP-ADDRESSS

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpFetchingDataDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Emp e = session.load(Emp.class, 12);
        // Emp e2=session.get(Emp.class,1);
        System.out.println(e);
        EmpAddress e1 = session.get(EmpAddress.class, 4);

        //  EmpAddress e3= session.load(EmpAddress.class,17);
        System.out.println(e1);

        session.close();
        sessionFactory.close();
    }
}
