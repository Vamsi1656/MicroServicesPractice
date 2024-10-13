package net.vamsi.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.vamsi.studentservice.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Student findBystudentId(Long studentId);

}
