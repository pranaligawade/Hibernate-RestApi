package com.mapping.M2M;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        SessionFactory s = new Configuration().configure().buildSessionFactory();
        EMP_Demo e1 = new EMP_Demo();
        EMP_Demo e2 = new EMP_Demo();

        e1.setEid(1);
        e1.setEmp_Name("tanbu");

        e2.setEid(2);
        e2.setEmp_Name("pranu");

        Project_Demo p1 = new Project_Demo();
        Project_Demo p2 = new Project_Demo();

        p1.setPid(1);
        p1.setProject_Name("library management");

        p2.setPid(2);
        p2.setProject_Name("chatbot");

        List<EMP_Demo>list=new ArrayList<>();
        List<Project_Demo> list1= new ArrayList<>();

        list.add(e1);
        list.add(e2);

        list1.add(p1);
        list1.add(p2);

        //set e1 project setting
        e1.setProject_demo(list1);
        p2.setEmp_demo(list);

        Session session= s.openSession();
        Transaction tx= session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);

        tx.commit();
        session.close();
        s.close();
    }
}
