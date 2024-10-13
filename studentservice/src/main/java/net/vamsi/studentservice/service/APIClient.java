package net.vamsi.studentservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import net.vamsi.studentservice.dto.DegreeDto;

@FeignClient(url="http://localhost:8803",value="DEGREE-SERVICE")
public interface APIClient {
	
	@GetMapping("api/degrees/{degreeCode}")
	DegreeDto getDegreeByCode(@PathVariable String degreeCode);
	
	
	}
