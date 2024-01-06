package com.suleman.theschool.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Department implements Serializable {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int deptId;

private String deptName;

public Department() {
	
}


public Department(int deptId, String deptName) {
	super();
	this.deptId = deptId;
	this.deptName = deptName;
}


public Department(String deptName) {
	super();
	this.deptName = deptName;
}


public int getDeptid() {
	return deptId;
}

public void setDeptid(int deptid) {
	this.deptId = deptid;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

@Override
public String toString() {
	return "Department [deptid=" + deptId + ", deptName=" + deptName + "]";
}


}
