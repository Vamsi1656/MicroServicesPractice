package net.vamsi.staffservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.AllArgsConstructor;
import net.vamsi.staffservice.dto.APIResponseDto;
import net.vamsi.staffservice.dto.StaffDepartmentDto;
import net.vamsi.staffservice.dto.StaffDto;
import net.vamsi.staffservice.entity.Staff;
import net.vamsi.staffservice.repository.StaffRepository;
import net.vamsi.staffservice.service.APIClient;
import net.vamsi.staffservice.service.StaffService;

@Service
@AllArgsConstructor
public class StaffServiceImpl implements StaffService {
	
	@Autowired
	private StaffRepository staffrepo;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
//	@Autowired
//	private WebClient webClient;
	
	@Autowired
	private APIClient apiClient;
	
	@Override
	public StaffDto saveStaff(StaffDto staffdto) {
		
		Staff staff=new Staff(
				
			staffdto.getStaffId(),
			staffdto.getStaffName(),
			staffdto.getStaffSalary(),
			staffdto.getStaffCode()
			);
		
		Staff savestaff=staffrepo.save(staff);
		
		StaffDto staffDto=new StaffDto(
				
				savestaff.getStaffId(),
				savestaff.getStaffName(),
				savestaff.getStaffSalary(),
				savestaff.getStaffCode()
				);
		return staffDto;
	}

	@Override
	public APIResponseDto getstaffById(Long staffCode) {

		Staff savedstaff=staffrepo.findBystaffId(staffCode);
		
		
//	ResponseEntity<StaffDepartmentDto> responseEntity=restTemplate.getForEntity("http://localhost:8805/api/staffdepartments/"+ savedstaff.getStaffCode(),
//				StaffDepartmentDto.class);
//	
//	StaffDepartmentDto staffDepartmentDto=responseEntity.getBody();
		
//	StaffDepartmentDto staffDepartmentDto=webClient.get()
//		.uri("http://localhost:8805/api/staffdepartments/"+ savedstaff.getStaffCode())
//		.retrieve()
//		.bodyToMono(StaffDepartmentDto.class)
//		.block();
		
		StaffDepartmentDto staffDepartmentDto=apiClient.getstaffBystaffcode(savedstaff.getStaffCode());
		
		StaffDto savedstaffDto=new StaffDto(
				savedstaff.getStaffId(),
				savedstaff.getStaffName(),
				savedstaff.getStaffSalary(),
				savedstaff.getStaffCode()
				);
		
		APIResponseDto apiresponsedto=new APIResponseDto();
		apiresponsedto.setStaffDto(savedstaffDto);
		apiresponsedto.setStaffDepartment(staffDepartmentDto);
		
		return apiresponsedto;
	}

}
