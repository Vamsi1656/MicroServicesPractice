package net.vamsi.staffservice.service;

import net.vamsi.staffservice.dto.APIResponseDto;
import net.vamsi.staffservice.dto.StaffDto;

public interface StaffService {
	
	
	StaffDto saveStaff(StaffDto staffdto);
	
	APIResponseDto getstaffById(Long staffId);

}
