package net.vamsi.staffservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.vamsi.staffservice.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff,Long> {
	
	
	Staff findBystaffId(Long staffCode);

}
