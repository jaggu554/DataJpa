package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Employee;
import com.example.repo.EmployeeRepository;

@SpringBootApplication

public class DataJPaJpaRepoApp2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
		=SpringApplication.run(DataJPaJpaRepoApp2Application.class, args);
		
		EmployeeRepository repo=
				context.getBean(EmployeeRepository.class);
		
//		Employee emp=new Employee();
//		emp.setEmpId(5);
//		emp.setEmpName("Naresh");
//		emp.setEmpCity("pamidi");
//		emp.setEmpSalary(1800000.000);
		
//		repo.save(emp);
		
//		Sort sort=Sort.by("empCity").ascending();
//		int pageNo=3;
//		PageRequest page=PageRequest.of(pageNo-1, 2);
//		
//		Page<Employee> findAll=repo.findAll(page);
//		List<Employee> emp=findAll.getContent();
//		emp.forEach(System.out::println);
//		Employee emp=new Employee();
//		emp.setEmpCity("Kandlapalle");
//		emp.setEmpName("Chandra");
//		Example<Employee> exm=Example.of(emp);
//	   List<Employee> e=repo.findAll(exm);
//	   e.forEach(System.out::println);
		
	
//		repo.updateRecord(5, "Naresh Reddy");		
		
		
		
//		Employee emp=new Employee();
//		emp.setEmpName("Prakash");
//		emp.setEmpSalary(2900000.52);
//		emp.setEmpCity("Rapthadu");
//		
//		emp=repo.save(emp);
//		System.out.println(emp);
		repo.updateRecordSalary(1, 8700000.0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
