package com.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	private long courseId;
	private String courseName;

	public Course() {
	}

	public Course(String courseName) {
		this.courseName = courseName;
	}

	@Id
	@GeneratedValue
	@Column(name="courseId")
	public long getcourseId() {
		return this.courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	@Column(name="courseName", nullable=false)
	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
