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

@Entity
@Data
public class FarmLand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer farmerId;
	
	public String landOwnerName;
	
	public Double landAcres;
	
	public String landPanchayat;
	
	@CreationTimestamp
	@Column(name="createdDate",updatable = false)
	public LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name="updated_date",insertable = false)
	public LocalDate updatedDate;
}
