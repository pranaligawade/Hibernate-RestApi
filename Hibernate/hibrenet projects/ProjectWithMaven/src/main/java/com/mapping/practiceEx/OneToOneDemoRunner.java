package com.mapping.practiceEx;
//teacher, student
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemoRunner {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Teacher t = new Teacher();
        t.setT_id(12);
        t.setWName("what is your name ? ");
        Student s = new Student();
        s.setS_id(1);
        s.setName("pranali");
        t.setS(s);
        s.setTeacher(t);

        Teacher t2 = new Teacher();
        t2.setT_id(11);
        t2.setWName("what is your name ? ");
        Student s1 = new Student();
        s1.setS_id(2);
        s1.setName("bhushan");
        t2.setS(s1);
        s1.setTeacher(t2);

        Teacher t3 = new Teacher();
        t3.setT_id(13);
        t3.setWName("what is your name ? ");
        Student s12 = new Student();
        s12.setS_id(3);
        s12.setName("pratu");
        t3.setS(s12);
        s12.setTeacher(t3);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(t2);
        session.save(s1);

        session.save(t);
        session.save(s);

        session.save(t3);
        session.save(s12);

        transaction.commit();

        Teacher teacher= session.get(Teacher.class,13);
        System.out.println(teacher.getWname());
        System.out.println(teacher.getS().getName());
        session.close();
        sessionFactory.close();


    }
}
