package com.example.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPk {

	private String accNo;
	
	private String accType;
}
