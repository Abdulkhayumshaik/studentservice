package net.spring.abdul.student.studentservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_details")
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "student_id",nullable = false)
	private int studentId;
	@Column(name = "student_name",nullable = false)
	private String studentName;
	@Column(name = "student_age")
	private int studentAge;

	
	public StudentDetails() {
		
	}
	
	public StudentDetails(Long id,int studentId,String studentName,int studentAge) {
		this.setId(id);
		this.setStudentId(studentId);
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
}
