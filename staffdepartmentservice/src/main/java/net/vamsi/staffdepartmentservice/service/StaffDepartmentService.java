package net.vamsi.staffdepartmentservice.service;

import net.vamsi.staffdepartmentservice.dto.StaffDepartmentDto;

public interface StaffDepartmentService {
	
	StaffDepartmentDto savestaffDepartment(StaffDepartmentDto staffDepartmentdto);
	
	StaffDepartmentDto getstaffBystaffcode(String staffCode);

}
