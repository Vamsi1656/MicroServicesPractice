package net.vamsi.staffdepartmentservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.vamsi.staffdepartmentservice.dto.StaffDepartmentDto;
import net.vamsi.staffdepartmentservice.entity.StaffDepartment;
import net.vamsi.staffdepartmentservice.repository.StaffDepartmentRepository;
import net.vamsi.staffdepartmentservice.service.StaffDepartmentService;

@Service
@AllArgsConstructor

public class StaffDepartmentImpl implements StaffDepartmentService {
	
	@Autowired
	private StaffDepartmentRepository staffdepartmentrepo;
	
	
	@Override
	public StaffDepartmentDto savestaffDepartment(StaffDepartmentDto staffDepartmentdto) {
		
		StaffDepartment staffdepartment=new StaffDepartment(
				staffDepartmentdto.getId(),
				staffDepartmentdto.getStaffDepartment(),
				staffDepartmentdto.getStaffCode()
				);
		StaffDepartment savedstaffdepartment=staffdepartmentrepo.save(staffdepartment);
		
		StaffDepartmentDto savestaffDepartmentdto = new StaffDepartmentDto(
				savedstaffdepartment.getId(),
				savedstaffdepartment.getStaffDepartment(),
				savedstaffdepartment.getStaffCode()
				
				);
		
		return savestaffDepartmentdto;
	}


	@Override
	public StaffDepartmentDto getstaffBystaffcode(String staffCode) {
		
		StaffDepartment staffDepartment=staffdepartmentrepo.findBystaffCode(staffCode);
		
		StaffDepartmentDto savedstaffdepartmentdto=new StaffDepartmentDto(
				
				staffDepartment.getId(),
				staffDepartment.getStaffDepartment(),
				staffDepartment.getStaffCode()
				);
		
		return savedstaffdepartmentdto;
	}

}
