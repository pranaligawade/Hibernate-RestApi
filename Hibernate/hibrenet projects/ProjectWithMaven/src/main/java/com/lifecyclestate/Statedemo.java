package com.lifecyclestate;

import com.hiber.config.Certificate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Statedemo {
    public static void main(String[] args) {
        //hibernate object state:
//    Transient
//    Persistent
//    Detached
//    Removed :  session.delete()
       System.out.println("State demo:");
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        // creating student object:
        Student s= new Student();
        s.setStudId(2);
        s.setName("prany");
        s.setCity("pune");
        s.setCertificate(new Certificate("java hibernate course","2 month"));
        // student :transient(create object, set the values)

        Session session= factory.openSession();
        Transaction t= session.beginTransaction();
        session.save(s);//student: persistent- (session,database)
        s.setName("john");// chnges reflect into db
        t.commit();
        session.close();
        //student :detached( not associated with session but store  in db)
        s.setName("sachin");
        System.out.println(s);//print the sachinvalue but not in db.
        factory.close();

    }

}
