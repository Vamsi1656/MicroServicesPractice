package net.vamsi.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.vamsi.studentservice.dto.APIResponseDto;
import net.vamsi.studentservice.dto.StudentDto;
import net.vamsi.studentservice.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping
	public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto studentDto){
		
		StudentDto savedStudent = studentservice.saveStudent(studentDto);
		
		return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
	}
	
	
	@GetMapping("{studentId}")
	public ResponseEntity<APIResponseDto> getStudentById(@PathVariable Long studentId){
		
		APIResponseDto apiResponseDto=studentservice.getStudentById(studentId);
		
		return new ResponseEntity<>(apiResponseDto,HttpStatus.OK);
	}

}
