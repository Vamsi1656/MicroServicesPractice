package net.vamsi.degreeservice.controller;

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
import net.vamsi.degreeservice.dto.DegreeDto;
import net.vamsi.degreeservice.service.DegreeService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/degrees")
public class DegreeController {
	
	@Autowired
	private DegreeService degreeservice;
	
	@PostMapping
	public ResponseEntity<DegreeDto> saveDegree(@RequestBody DegreeDto degreeDto){
		
		DegreeDto saveDegree=degreeservice.saveDegree(degreeDto);
		
		return new ResponseEntity<>(saveDegree,HttpStatus.CREATED);
	}
	
	@GetMapping("{degreeCode}")
	public ResponseEntity<DegreeDto> getDegreeByCode(@PathVariable String degreeCode){
		
		DegreeDto degreeDto=degreeservice.getDegreeByCode(degreeCode);
		
		return new ResponseEntity<>(degreeDto,HttpStatus.OK);
	}

}
