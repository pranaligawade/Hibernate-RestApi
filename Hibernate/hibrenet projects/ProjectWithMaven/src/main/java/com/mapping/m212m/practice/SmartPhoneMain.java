package com.mapping.m212m.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneMain {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        SmartPhone phone = new SmartPhone(12, "poco");
        MApps mApps = new MApps(1, "insta");
        MApps mApps1 = new MApps(2, "wp");
        MApps mApps2 = new MApps(3, "tele");
        mApps.setSmartPhone(phone);
        mApps1.setSmartPhone(phone);
        mApps2.setSmartPhone(phone);
        List<MApps> apps = new ArrayList<>();
        apps.add(mApps);
        apps.add(mApps1);
        apps.add(mApps2);
        phone.setmApps(apps);

        Session session = factory.openSession();
        Transaction t= session.beginTransaction();
        session.save(phone);
        session.save(mApps);
        session.save(mApps1);
        session.save(mApps2);

        SmartPhone s=session.get(SmartPhone.class,12);
        System.out.println(s.getmApps());
        t.commit();
        session.close();
        factory.close();
    }
}
