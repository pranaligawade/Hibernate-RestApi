package com.HQL;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HQLExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session1 = sessionFactory.openSession();
//
//        StudentHQL s4 = new StudentHQL(12123432, "RRIn", "ewertyjdnager");
//        System.out.println(s4);
//        StudentHQL s1 = new StudentHQL(454456, "RRIn", "ewertyjdnager");
//        System.out.println(s1);
//        StudentHQL s2 = new StudentHQL(1645468765, "HFSDOn", "dfhnbvager");
//        System.out.println(s2);
        // HQL
        //SYNTAX:
        // String query="from  StudentHQL where city='dfhnbvager'";
        String query = "from  StudentHQL where city=:x";// dynamic vallue setteing
        // String query="from  StudentHQL as s where s.city=:x and s.name=:n";// dynamic vallue setteing

        Query<StudentHQL> q = session1.createQuery(query);// creating query
        q.setParameter("x", "dfhnbvager");//set para
//   q.setParameter("n","HFSDOn");

        // single(unique)
        //  q.uniqueResult();
        //multiple(list)
        List<StudentHQL> list = q.list();
        for (StudentHQL s : list
        ) {
            System.out.println(s.getName() + s.getCity()); // print dataa
        }
        System.out.println("-------------------------------------");
        //delete
        Transaction t = session1.beginTransaction();
//
//        Query q2=session1.createQuery("delete from StudentHQL as s where s.city=:c");
//    q2.setParameter("c","ahmedfghnager");
//    int r= q2.executeUpdate();
//        System.out.println("deleted:");
//        System.out.println(r);
        //update
        System.out.println("--------------------------");
        Query q3 = session1.createQuery("update StudentHQL set city=:c where name=:n");
        q3.setParameter("c", "delhi");
        q3.setParameter("n", "peter");
        int r1 = q3.executeUpdate();
        System.out.println(r1 + "object updated");
        //join - que ans table used
        //Query q4 = session1.createQuery("select qu.Question, qu.queId, a.ans from Question as qu INNER JOIN qu.answer as a");
//        List<Objects[]> list3 = q4.list();
////   List<Objects[]> list3=q4.getResultList();
//        for (Objects[] arr : list3
//        ) {
//            System.out.println(Arrays.toString(arr));
//        }
//save
//        session1.save(s4);
//        session1.save(s1);
//        session1.save(s2);
        t.commit();
        session1.close();
        sessionFactory.close();
    }
}
