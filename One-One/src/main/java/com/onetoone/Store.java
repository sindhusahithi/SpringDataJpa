package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Store {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpId(123);
		emp.setEmpName("Sindhu");
		emp.setEmpAge(23);

		Student st = new Student();
		st.setStudentId(524);
		st.setStudentName("Sahithi");
		st.setStudentAge(24);

		emp.setStudent(st);
		st.setEmployee(emp);

		session.persist(emp);
		t.commit();

		session.close();
		System.out.println("success");
	}
}
