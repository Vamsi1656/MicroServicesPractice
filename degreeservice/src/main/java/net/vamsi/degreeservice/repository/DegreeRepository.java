package net.vamsi.degreeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import net.vamsi.degreeservice.entity.Degree;

public interface DegreeRepository extends JpaRepository<Degree, Long>{
	
	Degree findBydegreeCode(String degreeCode);

}
