package com.klef.soa.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DaycareCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    private String centerName;
    private String location;
    private Integer childCapacity;
    private Boolean licensed;
    
}
