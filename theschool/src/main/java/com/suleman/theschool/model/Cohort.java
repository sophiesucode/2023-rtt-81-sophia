package com.suleman.theschool.model;

	
import java.io.Serializable;
import javax.persistence. Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence. Table;
	 
 
 @Entity
 @Table(name= "cohort")
public class Cohort implements Serializable {
	
	private static final long serialVersionUID = 1L;
	 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY())
	private int cid;
	private String cName;
	private String duration;
}
