package net.vamsi.studentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class APIResponseDto {
	
	private StudentDto studentDto;
	
	private DegreeDto degreeDto;

}
