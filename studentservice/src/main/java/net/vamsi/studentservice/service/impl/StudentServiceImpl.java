package net.vamsi.studentservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.vamsi.studentservice.dto.APIResponseDto;
import net.vamsi.studentservice.dto.DegreeDto;
import net.vamsi.studentservice.dto.StudentDto;
import net.vamsi.studentservice.entity.Student;
import net.vamsi.studentservice.repository.StudentRepository;
import net.vamsi.studentservice.service.APIClient;
import net.vamsi.studentservice.service.StudentService;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class StudentServiceImpl implements StudentService{
	
	
	@Autowired
	private StudentRepository studentrepo;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
//	@Autowired
//	private WebClient webClient;
	
	@Autowired
	private APIClient apiClient;

	@Override
	public StudentDto saveStudent(StudentDto studentDto) {
		
		Student student = new Student(
				studentDto.getStudentId(),
				studentDto.getStudentfirstName(),
				studentDto.getStudentlastName(),
				studentDto.getDegreeCode()
				);
		Student saveStudent = studentrepo.save(student);
		
		StudentDto savedstudentDto=new StudentDto(
				saveStudent.getStudentId(),
				saveStudent.getStudentfirstName(),
				saveStudent.getStudentlastName(),
				saveStudent.getDegreeCode()
				
				);
		
		return savedstudentDto;
	}

	@Override
	public APIResponseDto getStudentById(Long studentId) {
		Student student=studentrepo.findById(studentId).get();
		
//	ResponseEntity<DegreeDto> responseEntity=restTemplate.getForEntity("http://localhost:8803/api/degrees/"+ student.getDegreeCode(),
//		DegreeDto.class);
//	
//	DegreeDto degreeDto=responseEntity.getBody();
		
//	DegreeDto degreeDto=webClient.get()
//		.uri("http://localhost:8803/api/degrees/"+ student.getDegreeCode())
//		.retrieve()
//		.bodyToMono(DegreeDto.class)
//		.block();
		
		DegreeDto degreeDto =apiClient.getDegreeByCode(student.getDegreeCode());
				
		StudentDto savedStudentDto=new StudentDto(
				student.getStudentId(),
				student.getStudentfirstName(),
				student.getStudentlastName(),
				student.getDegreeCode()
				);	
		
		APIResponseDto apiresponseDto=new APIResponseDto();
		apiresponseDto.setStudentDto(savedStudentDto);
		apiresponseDto.setDegreeDto(degreeDto);
		
		return apiresponseDto;
	}

}
