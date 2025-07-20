package net.spring.abdul.student.studentservice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import net.spring.abdul.student.studentservice.entity.StudentDetails;
import net.spring.abdul.student.studentservice.repository.StudentRepository;

public class StudentServiceTest {
	
	@Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    
    @Test
    void testSaveStudent_shouldSaveSuccessfully() {
        // Arrange
        StudentDetails student = new StudentDetails();
        student.setStudentId(1001);
        student.setStudentName("Abdul");
        student.setStudentAge(22);

        when(studentRepository.save(any(StudentDetails.class))).thenReturn(student);

        // Act
        StudentDetails result = studentService.saveStudent(student);

        // Assert
        assertNotNull(result);
        assertEquals("Abdul", result.getStudentName());
        assertEquals(22, result.getStudentAge());
        verify(studentRepository, times(1)).save(student);
    }

}
