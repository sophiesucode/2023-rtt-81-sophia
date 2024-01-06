package com.suleman.hibernateuser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TypedQuery;
import javax.transaction.Transaction;



import com.suleman.hibernateuser.util.HibernateUtil;

@NamedQueries({
	@NamedQuery(name="myUpdateuser", query="UPDATE User SET fullname= :fullname WHERE id")
})
@Entity
@Table(name="users")
public class User {
	@Column(name="user_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String fullname;
	private String email;
	private String password;
	private int age;
	private double salary;
	private String city;
	
	public User() {}

	public User(String fullname, String email, String password, int age, double salary, String city) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}
	
	public void updateUser() {
		Session session= HibernateUtil.getConnection();
		Transaction t= session.beginTransaction();
		TypedQuery<?> query= session.getNamedQuery(city);
		query.setParameter("fullname", query);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + ", age="
				+ age + ", salary=" + salary + ", city=" + city + "]";
	}
	
	
	
	

}
