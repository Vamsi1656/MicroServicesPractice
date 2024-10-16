package net.vamsi.staffservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponseDto {
	
	private StaffDto staffDto;
	
	private StaffDepartmentDto staffDepartment;

}
