package net.vamsi.degreeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DegreeDto {
	
	private Long id;
	
	private String degreeName;
	
	private String degreeSpecilization;
	
	private String degreeCode;

}
