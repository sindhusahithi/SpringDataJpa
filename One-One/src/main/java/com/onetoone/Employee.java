package com.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int EmpId;
	private String EmpName;
	private int EmpAge;

	@OneToOne(targetEntity = Student.class, cascade = CascadeType.ALL)

	private Student student;

	public int getEmpId() {
		return EmpId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getEmpAge() {
		return EmpAge;
	}

	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

}
