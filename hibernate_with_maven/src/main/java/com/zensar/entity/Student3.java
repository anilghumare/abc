package com.zensar.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "StudentInformation")
@Table(name = "StudentInfo")
@NamedQuery(name = "abc", query = "From StudentInformation s where s.studentName = 'Anil'")
public class Student3 {
	@Id
	@Column(name = "Id")
	@GeneratedValue()
	private int studentId;
	
	@Column(name = "Name", length = 50)
	private String studentName;
	
	@Column(name = "Age",nullable = false)
	private int studentAge;
	
	@Temporal(value = TemporalType.DATE)
	private Date birthDate;
	

	public Student3(int studentId, String studentName, int studentAge, Date birthDate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.birthDate = birthDate;
	}
	

	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public Student3() {
		super();
	}

	public Student3(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student3 [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}

	public static void main(String[] args) {

	}

}
