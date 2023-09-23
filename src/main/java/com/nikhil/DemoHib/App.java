package com.nikhil.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Student_name sn=new Student_name();
    	sn.setFname("Shivam");
    	sn.setMname("Kumar");
    	sn.setLname("Pandey");
    	
        Student stud=new Student();
        stud.setSid(101);
        stud.setsTech("Java");
        stud.setSname(sn);
        
        
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
        
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf=con.buildSessionFactory(reg);
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        session.save(stud);
        tx.commit();
        
        System.out.println(stud);
    }
}
