package com.mapping;
//one to one
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String[] args) {
        System.out.println("project started...");
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        // creating que;
        Question q= new Question();
        q.setId(1212);
        q.setQuestion("what is java");
        //creating ans
        Answer ans= new Answer();
        ans.setAns_id(343);
        ans.setAns("java is programming language");
        q.setAns(ans);
        ans.setQuestion(q);
        //que
        Question q1= new Question();
        q1.setId(242);
        q1.setQuestion("what is collection framework");
        //ans
        Answer ans1= new Answer();
        ans1.setAns_id(344);
        ans1.setAns("api to work with object in java");
        q1.setAns(ans1);
        ans1.setQuestion(q1);
        //session
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.save(q);
        session.save(q1);
        session.save(ans);
        session.save(ans1);
        transaction.commit();
        //fetching...............
       Question newq=(Question) session.get(Question.class,242);
        System.out.println( newq.getQuestion());
        System.out.println(newq.getAns().getAns());
       session.close();
         sessionFactory.close();
    }
}
