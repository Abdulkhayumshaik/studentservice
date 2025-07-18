package net.spring.abdul.student.studentservice.dto;

public class StudentDetailsDto {
	
	private int studentId;
	private String studentName;
	private int studentAge;
	
	public StudentDetailsDto() {
		
	}
	
	public StudentDetailsDto(int studentId,String studentName,int studentAge) {
		
		this.setStudentId(studentId);
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
		
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
