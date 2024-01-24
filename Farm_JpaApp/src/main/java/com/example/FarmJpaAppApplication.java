package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.entity.FarmLand;
import com.example.repository.FarmLandRepository;

@SpringBootApplication
public class FarmJpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FarmJpaAppApplication.class, args);

		FarmLandRepository repo = context.getBean(FarmLandRepository.class);

//		FarmLand fl = new FarmLand();
//
//		fl.setLandOwnerName("NareshReddy");
//		fl.setLandAcres(500.89);
//		fl.setLandPanchayat("VankarajuKaluva");
//
//		FarmLand f2 = new FarmLand();
//
//		f2.setLandOwnerName("Chandra");
//		f2.setLandAcres(700.89);
//		f2.setLandPanchayat("VankarajuKaluva");
//
//		FarmLand f3 = new FarmLand();
//
//		f3.setLandOwnerName("pavan");
//		f3.setLandAcres(800.89);
//		f3.setLandPanchayat("Eddulapalli");
//		
//		repo.saveAll(Arrays.asList(fl,f2,f3));
		
		
//		FarmLand farm=new FarmLand();
//		farm.setLandAcres(1000.15);
//		farm.setLandOwnerName("King_Jaggu");
//		farm.setLandPanchayat("World");
//		
//		repo.save(farm);
		
//		
//		repo.updatelandPanchayat(6, "Eddulapalli");
		
//		Sort sort=Sort.by("landAcres").descending();
//		List<FarmLand> land=repo.findAll(sort);
//		land.forEach(System.out::println);
		
		int PageNo=3;
		PageRequest page=PageRequest.of(PageNo-1, 2);
		Page<FarmLand> fland=repo.findAll(page);
		fland.forEach(System.out::println);

	}

}
