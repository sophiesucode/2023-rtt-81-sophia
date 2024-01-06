package com.suleman.SMSold.jpa.entitymodels;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable {

	private static final long serialVersionUID=1L;
	
	@Id
	@Column(name="email") //name of column in mysql table
	private String sEmail;
	
	@Column(name="name") //name of column in mysql table
	private String sName;
	
	@Column(name="password")//name of column in mysql table
	private String sPass;
	
	@ManyToMany //a student can have many courses and 1 course can have many students
	 @JoinTable(
           name = "StudentCourses",
           joinColumns = @JoinColumn(name = "email"),
           inverseJoinColumns = @JoinColumn(name = "id")
   )
	private List<Course> sCourses;//list of courses student has

	
	public Student() {
	
	}
	
	


	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}

	


	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPass() {
		return sPass;
	}

	public void setsPass(String sPass) {
		this.sPass = sPass;
	}

	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}



	@Override
	public String toString() {
		return "Student [sEmail=" + sEmail + ", sName=" + sName + ", sPass=" + sPass + ", sCourses=" + sCourses + "]";
	}


	
	
	
	
}




