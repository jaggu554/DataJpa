package com.example.repo;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Employee;
@Transactional
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Modifying
	@Query(value="delete from Employee where emp_id=:empId",nativeQuery = true)
	public void deleteRecord(Integer empId);
	
	@Modifying
	@Query(value="update Employee e set e.emp_name=:empName where e.emp_id=:empId" ,nativeQuery = true)
	public void updateRecordName(@Param("empId") Integer empId,@Param("empName") String empName);
	
	@Modifying
	@Query(value="update Employee e set e.empSalary=:empSalary where e.empId=:empId")
	@UpdateTimestamp
	public void updateRecordSalary(@Param("empId") Integer empId,@Param("empSalary") Double empSalary);
}
