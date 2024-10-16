package net.vamsi.studentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
	
    private Long studentId;
	
	private String studentfirstName;
	
	private String studentlastName; 
	
	private String degreeCode;

}
