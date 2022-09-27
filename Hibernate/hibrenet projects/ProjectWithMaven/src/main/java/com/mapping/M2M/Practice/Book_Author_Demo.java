package com.mapping.M2M.Practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book_Author_Demo {
    public static void main(String[] args) {
        SessionFactory factory= new Configuration().configure().buildSessionFactory();
        Authors authors= new Authors(1,"gawade","male");
        Authors authors1= new Authors(2,"gawand","male");

        Books books= new Books(3,"the book of lost name ","kristin",new Date());
        Books books1= new Books(4,"harry potter","j.k rowling",new Date(20/9/2022));

        List<Authors> list= new ArrayList<>();
        List<Books> list1= new ArrayList<>();

        list.add(authors);
        list.add(authors1);

        list1.add(books);
        list1.add(books1);

        authors.setBooksList(list1);
        authors1.setBooksList(list1);

        books.setAuthorsList(list);
        books1.setAuthorsList(list);


        Session session=factory.openSession();
        Transaction transaction= session.beginTransaction();

        session.save(books);
        session.save(books1);
        session.save(authors);
        session.save(authors1);

        transaction.commit();
        session.close();
        factory.close();
    }
}
