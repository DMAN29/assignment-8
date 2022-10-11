package com.example.OneToManyMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@ Table(name = "Courses")
public class Course {
	@Id
	@Column(name = "Course_id")
	private int c_id;
	@Column(name = "Course_name")
	private String c_name;
	@ManyToOne
	private Teachers Teachers;
	
	public Teachers getTeachers() {
		return Teachers;
	}
	public void setTeachers(Teachers Teachers) {
		this.Teachers = Teachers;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public Course(int c_id, String c_name) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}