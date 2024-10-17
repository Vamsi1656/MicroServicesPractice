package net.vamsi.staffservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import net.vamsi.staffservice.dto.StaffDepartmentDto;

@FeignClient(name="STAFFDEPARTMENTSERVICE")
public interface APIClient {
	
	@GetMapping("/api/staffdepartments/{staffCode}")
	StaffDepartmentDto getstaffBystaffcode(@PathVariable String staffCode);

}
