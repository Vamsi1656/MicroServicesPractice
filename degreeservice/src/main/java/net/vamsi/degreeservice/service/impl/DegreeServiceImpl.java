package net.vamsi.degreeservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.vamsi.degreeservice.dto.DegreeDto;
import net.vamsi.degreeservice.entity.Degree;
import net.vamsi.degreeservice.repository.DegreeRepository;
import net.vamsi.degreeservice.service.DegreeService;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class DegreeServiceImpl implements DegreeService {
	
	@Autowired
	private DegreeRepository degreeRepo;

	@Override
	public DegreeDto saveDegree(DegreeDto degreeDto) {
		Degree degree=new Degree(
				degreeDto.getId(),
				degreeDto.getDegreeName(),
				degreeDto.getDegreeSpecilization(),
				degreeDto.getDegreeCode()
				);
		
		Degree savedegree=degreeRepo.save(degree);
		
		DegreeDto saveddegreedto=new DegreeDto(
				savedegree.getId(),
				savedegree.getDegreeName(),
				savedegree.getDegreeSpecilization(),
				savedegree.getDegreeCode()
				);
		return saveddegreedto;
	}

	@Override
	public DegreeDto getDegreeByCode(String degreeCode) {
		Degree degree = degreeRepo.findBydegreeCode(degreeCode);
		
		DegreeDto degreeDto=new DegreeDto(
				degree.getId(),
				degree.getDegreeName(),
				degree.getDegreeSpecilization(),
				degree.getDegreeCode()
				
				);
		return degreeDto;
	}

}
