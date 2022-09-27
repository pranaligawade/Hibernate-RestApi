package com.mapping.practiceEx;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDemo {
    public static void main(String[] args) {SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
       Employee e= new Employee();
       e.setEmpid(3);
       e.setName("idc");
       e.setCity("pune");

       EmpComp comp= new EmpComp();
        comp.setCmpId(4);
        comp.setCompany_name("whats your company name");
       comp.setEmployee(e);
       e.setEmpComp(comp);


        Session session= sessionFactory.openSession();
        Transaction t= session.beginTransaction();
        session.save(e);
        session.save(comp);
        t.commit();

        EmpComp data=session.get(EmpComp.class,4);
        System.out.println(data.getCompany_name());
        System.out.println(data.getEmployee().getName());
        session.close();
        sessionFactory.close();
    }
}
