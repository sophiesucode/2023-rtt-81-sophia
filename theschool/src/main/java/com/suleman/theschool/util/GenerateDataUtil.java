package com.suleman.theschool.util;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suleman.theschool.model.Address;
import com.suleman.theschool.model.Department;
import com.suleman.theschool.model.Department1M;
import com.suleman.theschool.model.Person;
import com.suleman.theschool.model.Teacher;
import com.suleman.theschool.model.Teacher1M;

public class GenerateDataUtil {
	
	public void createDataManyToOne() {
		
		Session session= HibernateUtil.getConnection();
		Transaction t= session.beginTransaction();
		
		//create department
		
		Department dep= new Department();
		dep.setDeptName("IT");
		
		Department dep2= new Department();
		dep2.setDeptName("HR");
		
		//create Teacher
		
		Teacher t1= new Teacher();
		t1.setDepartment(dep);
		t1.setSalary("1000");
		t1.setTeacherName("MHaseeb");
		
		
		Teacher t2= new Teacher();
		
		t2.setDepartment(dep);
		t2.setSalary("22000");
		t2.setTeacherName("Shahparan");
		
		Teacher t3= new Teacher();
		
		t3.setDepartment(dep2);
		t3.setSalary("3000");
		t3.setTeacherName("James");
		
		Teacher t4= new Teacher();
		t4.setDepartment(dep2);
		t4.setSalary("40000");
		t4.setTeacherName("Joseph");
		
		//Storing Departments in database 
		
		session.persist(dep);
		session.persist(dep2);
		
		//store Teachers
		
		session.persist(t);
		session.persist(t1);
		session.persist(t3);
		session.persist(t4);
		
		t.commit();
		
	}
	
	public static void createDataOneToMany() {
		Session session= HibernateUtil.getConnection();
		Transaction t=session.beginTransaction();
		
		
		
		Teacher1M t1 = new Teacher1M();
		t1.setTeacherName(null);
		t1.setSalary(null);
		
		Teacher1M t2= new Teacher1M();
		t2.setTeacherName(null);
		t2.setSalary(null);
		
		Teacher1M t3= new Teacher1M();
		t3.setTeacherName(null);
		t3.setSalary(null);
		
		Teacher1M t4= new Teacher1M();
		t4.setTeacherName(null);
		t4.setSalary(null);
		
		Teacher1M t5= new Teacher1M();
		t5.setTeacherName(null);
		t5.setSalary("200");
		
		List<Teacher1M> teacherList= new ArrayList<>();
		
		teacherList.add(t1);
				
				
				//create departments
				
		Department1M dep1 = new Department1M();
		dep1.setDeptName(null);
		
		Department1M dep2 = new Department1M();
		dep2.setDeptName(null);
		
		
		
		
		
		
	}
	
	public static void createDataOneToOne() {
		Session session=HibernateUtil.getConnection();
		Transaction t= session.beginTransaction();
		
		Address a1= new Address();
		a1.setCity("Nyc");
		a1.setState("Ny");
		a1.setStreet("27th Street");
		a1.setZipcode(11103);
		
		Address a2 = new Address();
		a2.setCity("Atlanta");
		a2.setState("Ga");
		a2.setStreet("Peachtree Street");
		a2.setZipcode(30303);
		
		
		Person p1 = new Person();
		p1.setAge(25);
		p1.setEmail("");
		p1.setName(null);
		p1.setAddress(a2);
		
		Person p2 = new Person();
		p2.setAge(25);
		p2.setEmail(null);
		p2.setName(null);
		p2.setAddress(a2);
		
		session.persist(t);
		session.persist(t);
		session.persist(t);
		session.persist(t);
		
	}

}
