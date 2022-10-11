package com.example.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml").addAnnotatedClass(Teachers.class).addAnnotatedClass(Course.class);
        SessionFactory factory = con.buildSessionFactory();
        Teachers t1 = new Teachers();
        t1.setT_id(101);
        t1.setT_name("Jonardan");
        
        Course c1 = new Course();
        c1.setC_id(10);
        c1.setC_name("JAVA");
        c1.setTeachers(t1);
        
        Course c2 = new Course();
        c2.setC_id(11);
        c2.setC_name("Python");
        c2.setTeachers(t1);
        
        Course c3 = new Course();
        c3.setC_id(12);
        c3.setC_name("C++ ");
        c3.setTeachers(t1);
        List<Course> l1 = new ArrayList();
        l1.add(c1);
        l1.add(c2);
        l1.add(c3);
        
        
        t1.setC(l1);
        Session s= factory.openSession();
        Transaction txt = s.beginTransaction();
        s.save(t1);
        s.save(c1);
        s.save(c2);
        s.save(c3);
        txt.commit();
        s.close();
           
        
    }
}