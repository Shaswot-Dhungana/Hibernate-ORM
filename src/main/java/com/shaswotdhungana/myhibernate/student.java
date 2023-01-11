package com.shaswotdhungana.myhibernate;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


//to use custom name for table in database use :~
// @Entity Annotation is used to select whoch class will be linked with table in database.
//@Entity(name="student_details")
//OR
//@Table(name="student_details")
// if we use only @Entity then table name will be same as class name.
// @Id annotation is used to choose primary key.
// @GeneratedValue annotation for auto increment id / primary key.



@Entity(name="student_details")
public class student {
	


	@Id
	@GeneratedValue
	private int uid;
	
	private String name;
	private String country;
	
	
	public student(int uid, String name, String country) {
		super();
		this.uid = uid;
		this.name = name;
		this.country = country;
	}
	
	
	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.uid+","+this.name+","+this.country;
	}

	
}
