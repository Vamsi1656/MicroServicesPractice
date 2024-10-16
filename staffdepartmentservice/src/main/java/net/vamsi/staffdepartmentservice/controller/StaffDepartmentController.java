package net.vamsi.staffdepartmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.vamsi.staffdepartmentservice.dto.StaffDepartmentDto;
import net.vamsi.staffdepartmentservice.service.StaffDepartmentService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/staffdepartments")

public class StaffDepartmentController {

	@Autowired
	private StaffDepartmentService staffDepartmentservice;
	
	@PostMapping
	public ResponseEntity<StaffDepartmentDto> saveStaffDepartment(@RequestBody StaffDepartmentDto staffDepartmentDto){
		
		StaffDepartmentDto savedstaffDepartmentDto=staffDepartmentservice.savestaffDepartment(staffDepartmentDto);
		
		return new ResponseEntity<>(savedstaffDepartmentDto,HttpStatus.CREATED);
	}
	
	
	@GetMapping("{staffCode}")
	public ResponseEntity<StaffDepartmentDto> getstaffBystaffcode(@PathVariable String staffCode){
		
		StaffDepartmentDto savestaffDepartmentDto=staffDepartmentservice.getstaffBystaffcode(staffCode);
		
		return new ResponseEntity<>(savestaffDepartmentDto,HttpStatus.OK);
	}
	
}
