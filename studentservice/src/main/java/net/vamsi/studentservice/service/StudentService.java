package net.vamsi.studentservice.service;

import net.vamsi.studentservice.dto.APIResponseDto;
import net.vamsi.studentservice.dto.StudentDto;

public interface StudentService {
	
	StudentDto saveStudent(StudentDto studentDto);
	
	
	APIResponseDto getStudentById(Long studentId);

}
