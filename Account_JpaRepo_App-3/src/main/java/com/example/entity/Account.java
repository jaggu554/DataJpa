package com.example.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Account {

	private String AccHolderName;
	
	private String AccBranch;
	
	@EmbeddedId
	private AccountPk accountPk;
}
