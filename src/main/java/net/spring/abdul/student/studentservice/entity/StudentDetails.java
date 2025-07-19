package net.spring.abdul.student.studentservice.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
	@NotNull(message = "student id not a null value ")
	@Column(name = "student_id", nullable = false, unique = true)
	@Min(value = 1, message = "value is greater than zero")
	private int studentId;
	@NotBlank(message = "Stundent name should not be blank")
	@Size(max = 100, message = "studnet name must be 100 characters only")
	@Column(name = "student_name", nullable = false)
	private String studentName;
	@Min(message = "age must be positive ", value = 0)
	@Max(message = "Age must be relastick", value = 150)
	@Column(name = "student_age")
	private int studentAge;

	// Default constructor
	public StudentDetails() {

	}

	// Parameterized constructor
	public StudentDetails(Long id, int studentId, String studentName, int studentAge) {
		this.setId(id);
		this.setStudentId(studentId);
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
	}

	// Getters and Setters

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
