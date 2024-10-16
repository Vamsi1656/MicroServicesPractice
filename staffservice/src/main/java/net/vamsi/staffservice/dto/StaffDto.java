package net.vamsi.staffservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StaffDto {
	
   private Long staffId;
	
	private String staffName;
	
	private String staffSalary;
	
	private String staffCode;
	

}
