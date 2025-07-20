package net.spring.abdul.student.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import net.spring.abdul.student.studentservice.dto.StudentDetailsDto;
import net.spring.abdul.student.studentservice.entity.StudentDetails;
import net.spring.abdul.student.studentservice.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public ResponseEntity<String> createStudent(@Valid @RequestBody StudentDetailsDto dto){
		
		StudentDetails student = new StudentDetails();
		student.setStudentId(dto.getStudentId());
		student.setStudentName(dto.getStudentName());
		student.setStudentAge(dto.getStudentAge());
		
		studentService.saveStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body("Student Details saved");
		
	}

}
