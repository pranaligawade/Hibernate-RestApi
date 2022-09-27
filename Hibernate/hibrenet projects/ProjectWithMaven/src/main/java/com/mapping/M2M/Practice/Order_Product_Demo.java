package com.mapping.M2M.Practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order_Product_Demo {
    public static void main(String[] args) {
        SessionFactory factory= new Configuration().configure().buildSessionFactory();

        Orders o1=new Orders();
        Orders o2= new Orders();


        o1.setOrder_id(15);
        o1.setCustomerName("jiya");
        o1.setOrder_date(new Date());
        o1.setShipping_date(new Date());
        o1.setShiperid(12734);


        o2.setOrder_id(16);
        o2.setCustomerName("riya");
        o2.setOrder_date(new Date());
        o2.setShipping_date(new Date());
        o2.setShiperid(12357);


        Products p1= new Products();
        Products p2= new Products();

        p1.setProduct_id(14);
        p1.setProduct_name(" asus ");
        p1.setDescription("Processor (CPU):\tIntel Core i5 (sixth generation or newer) or equivalent\n" +
                "Memory:\t16 GB RAM\n" + "Storage:\t500 GB internal storage drive\n" +
                "Monitor/Display:\t14\" LCD monitor, resolution of 1600 x 900 or better.\n" +
                "Netwo Adapter:\t802.11ac 2.4/5 GHz wireless adapter");
        p1.setPrice(700000);

        p2.setProduct_id(16);
        p2.setProduct_name(" asusrog");
        p2.setDescription( "Storage:\t500 GB internal storage drive\n"  +
                "Netwo Adapter:\t802.11ac 2.4/5 GHz wireless adapter");
        p2.setPrice(900000);

        List<Orders> list= new ArrayList<>();
        List<Products>plist= new ArrayList<>();

        list.add(o1);
        list.add(o2);

        plist.add(p1);
        plist.add(p2);

        o1.setProductsList(plist);
        p1.setOrdersList(list);
//        o2.setProductsList(plist);
//        p2.setOrdersList(list);

        Session s=factory.openSession();
        Transaction tx= s.beginTransaction();

        s.save(o1);
        s.save(o2);
        s.save(p1);
        s.save(p2);

        tx.commit();
        s.close();
        factory.close();

    }
}
