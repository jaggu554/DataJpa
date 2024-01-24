package com.example.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer empId;
	public String empName;
	public String empCity;
	public Double empSalary;
	
	@Column(name="created_date",updatable = false)
	@CreationTimestamp
	public LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name="updated_date",insertable = false)
	public LocalDate updatedDate;
}
