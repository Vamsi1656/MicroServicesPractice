package net.vamsi.staffservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDepartmentDto {
	
	    private Long id;
		
		private String staffDepartment;
		
		private String staffCode;

}
