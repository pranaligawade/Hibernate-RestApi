package com.Cascading;

import com.mapping.m212m.Answer;
import com.mapping.m212m.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CascadingEX {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session s=sessionFactory.openSession();
        Question q1= new Question();
        q1.setQueId(345);
        q1.setQuestion("what is swing  framework");

        Answer answer= new Answer(12311,"swing is imp concept");
        Answer answer1= new Answer(14553," second ans  is imp concept");
        Answer answer2= new Answer(14543,"third is imp concept");
        List<Answer> list= new ArrayList<>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);
        q1.setAnswer(list);
        Transaction t =s.beginTransaction();
        s.save(q1);

        t.commit();
        s.close();
        sessionFactory.close();
    }
}
