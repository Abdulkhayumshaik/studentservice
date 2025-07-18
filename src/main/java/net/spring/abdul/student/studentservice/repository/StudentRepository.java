package net.spring.abdul.student.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.spring.abdul.student.studentservice.entity.StudentDetails;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails, Long> {

}
