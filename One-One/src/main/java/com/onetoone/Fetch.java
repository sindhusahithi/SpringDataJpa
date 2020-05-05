package com.onetoone;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Fetch {

	public static void main(String[] args) {    
	    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	        
	    TypedQuery query=session.createQuery("from Employee");    
	    List<Employee> list=query.getResultList();   
	        
	    Iterator<Employee> itr=list.iterator();    
	    while(itr.hasNext()){    
	     Employee emp=itr.next();    
	     System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpAge());    
	     Student st=emp.getStudent();    
	     System.out.println(st.getStudentId()+" "+st.getStudentName()+" "+    
	        st.getStudentAge());    
	    }    
	    
	    session.close();    
	    System.out.println("success");    
	}    
	}    

