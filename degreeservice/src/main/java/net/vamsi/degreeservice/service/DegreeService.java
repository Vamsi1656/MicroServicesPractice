package net.vamsi.degreeservice.service;

import net.vamsi.degreeservice.dto.DegreeDto;

public interface DegreeService {
	
	DegreeDto saveDegree(DegreeDto degreeDto);
	
	DegreeDto getDegreeByCode(String degreeCode);

}
