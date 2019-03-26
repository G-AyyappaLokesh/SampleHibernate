package com.example.HibernateDemo;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;


 
public class App 
{
    public static void main( String[] args ) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
    {
      Data d=new Data();
      d.setId(1);
      d.setName("lokesh");
      d.setSalary("20000");
      
      
      StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
      Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
    
  SessionFactory factory = meta.getSessionFactoryBuilder().build();  
  Session session = factory.openSession();  
  org.hibernate.Transaction t =  session.beginTransaction(); 
  session.save(d);  
  t.commit();  
  System.out.println("successfully saved");    
   factory.close();  
   session.close(); 
    
    }
}
