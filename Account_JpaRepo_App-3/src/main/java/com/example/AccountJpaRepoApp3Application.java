package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Account;
import com.example.entity.AccountPk;
import com.example.repository.AccountRepository;

@SpringBootApplication
public class AccountJpaRepoApp3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
				SpringApplication.run(AccountJpaRepoApp3Application.class, args);
		AccountRepository repo=context.getBean(AccountRepository.class);
		
		AccountPk accountPk=new AccountPk();
		accountPk.setAccNo("123456789");
		accountPk.setAccType("Savings");
		
		Account account=new Account();
		account.setAccBranch("Pamidi");
		account.setAccHolderName("JagadeshReddy");
		account.setAccountPk(accountPk);
		
		repo.save(account);
	}

}
