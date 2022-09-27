package com.mapping.fetchingType;
// option 1: call getter method while session open
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Eager_lazy_demo {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
     //create ques n set que
          Question q= new Question();
//        q.setQueId(1);
//        q.setQuestion("what is python");
          Answer a= new Answer();
//        a.setAnsId(1);
//        a.setAns("python is programming lang.");
//        a.setQuestion(q);
//        //create n set ans
//        Answer a1= new Answer();
//        a1.setAnsId(2);
//        a1.setAns("python is programming lang with help of we can create softwares.");
//        a1.setQuestion(q);
//
//        Answer a2= new Answer();
//        a2.setAnsId(3);
//        a2.setAns("python is object oriented prog.lang..");
//        a2.setQuestion(q);
//
//        //list of ans
//        List<Answer> list= new ArrayList<>();
//        list.add(a);
//        list.add(a1);
//        list.add(a2);
//        q.setAnswer(list);//set the list into ans- one question have multiple ans
        //session
        Session session= sessionFactory.openSession();
        Transaction t= session.beginTransaction();
        // save
//        session.save(q);
//        session.save(a);
//        session.save(a1);
//        session.save(a2);
        Question que=(Question)session.get(Question.class,1);
        System.out.println(que.getQueId());
        System.out.println(que.getQuestion());
        System.out.println(que.getAnswer());// option 1: call getter method while session open

        //  lazy- by default lazy fetching
       // System.out.println(que.getAnswer().size());
//eager-,fetch = FetchType.EAGER in mappedby in question

         t.commit();
         session.close();
      //   System.out.println(que.getAnswer());// for testing


        sessionFactory.close();
    }
}
