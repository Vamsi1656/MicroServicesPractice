package net.vamsi.studentservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import net.vamsi.studentservice.dto.DegreeDto;

@FeignClient(name="DEGREESERVICE")
public interface APIClient {
	
	@GetMapping("api/degrees/{degreeCode}")
	DegreeDto getDegreeByCode(@PathVariable String degreeCode);
	
	
	}
