package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.FarmLand;

@Repository
@Transactional
public interface FarmLandRepository extends JpaRepository<FarmLand, Integer>{

	@Modifying
	@Transactional
	@Query(value="update FarmLand  f set f.landAcres=:acre where f.farmerId=:Id")
	public void updateLandAcres(@Param("Id") Integer Id,@Param("acre")Double acre);
	
	@Modifying
	@Query(value="update farm_land f set f.land_panchayat=:village where f.farmer_id=:Id",nativeQuery = true)
	public void updatelandPanchayat(@Param("Id") Integer Id,@Param("village") String village);
	
}
