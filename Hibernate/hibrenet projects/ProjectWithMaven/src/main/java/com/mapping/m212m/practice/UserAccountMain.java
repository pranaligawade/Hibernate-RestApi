package com.mapping.m212m.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class UserAccountMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        User u= new User();
        u.setUser_id(5);
        u.setName("jiya");



        Account acc= new Account();
        acc.setAcc_Id(111);
        acc.setAccount_Type("current");
        acc.setUser(u);


        Account acc1= new Account();
        acc1.setAcc_Id(112);
        acc1.setAccount_Type("saving");
        acc1.setUser(u);

        Account acc2= new Account();
        acc2.setAcc_Id(113);
        acc2.setAccount_Type("fd");
        acc2.setUser(u);

        List<Account> accounts=new ArrayList<>();
        accounts.add(acc);
        accounts.add(acc1);
        accounts.add(acc2);
        u.setAccounts(accounts);

           // session.....
        Session session= sessionFactory.openSession();
        Transaction t= session.beginTransaction();
        //save............
        session.save(u);
        session.save(acc);
        session.save(acc1);
        session.save(acc2);

        //fetching......

        User BHU=session.get(User.class,3);
        System.out.println(BHU.getName());
        for (Account a: BHU.getAccounts()
             ) {
            System.out.println(a.getAccount_Type());
        }



        t.commit();
        session.close();
        sessionFactory.close();
    }
}
