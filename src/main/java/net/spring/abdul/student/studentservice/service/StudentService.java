package net.spring.abdul.student.studentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spring.abdul.student.studentservice.entity.StudentDetails;
import net.spring.abdul.student.studentservice.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public StudentDetails saveStudent(StudentDetails studentDetails){
		
		return studentRepository.save(studentDetails);
		
	}

}
