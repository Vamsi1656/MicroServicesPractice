package net.vamsi.staffservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="staff_details")
@AllArgsConstructor
@NoArgsConstructor

public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long staffId;
	
	private String staffName;
	
	private String staffSalary;
	
	private String staffCode;
	

}
