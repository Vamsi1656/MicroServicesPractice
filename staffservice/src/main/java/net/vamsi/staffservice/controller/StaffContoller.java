package net.vamsi.staffservice.controller;

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
import net.vamsi.staffservice.dto.APIResponseDto;
import net.vamsi.staffservice.dto.StaffDto;
import net.vamsi.staffservice.service.StaffService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/staff")
public class StaffContoller {
	
	@Autowired
	private StaffService staffservice;
	
	@PostMapping
	public ResponseEntity<StaffDto> savestaff(@RequestBody StaffDto staffDto){
		
		StaffDto savedstaff=staffservice.saveStaff(staffDto);
		
		return new ResponseEntity<>(savedstaff,HttpStatus.CREATED);
	}
	
	@GetMapping("{staffId}")
	public ResponseEntity<APIResponseDto> getstaffById(@PathVariable Long staffId){
		
		APIResponseDto savedStaffDto=staffservice.getstaffById(staffId);
		
		return new ResponseEntity<>(savedStaffDto,HttpStatus.OK);
	}

}
