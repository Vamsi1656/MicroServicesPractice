package net.vamsi.staffdepartmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.vamsi.staffdepartmentservice.entity.StaffDepartment;

public interface StaffDepartmentRepository extends JpaRepository<StaffDepartment, Long> {
	
	
	StaffDepartment findBystaffCode(String staffCode);

}
