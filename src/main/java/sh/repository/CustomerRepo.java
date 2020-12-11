package sh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sh.entities.Customer;


public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
//	@Query("Select c form customer_inventory c where c.email = :email")
//	Customer findByEmail(@Param("email") String email);	
}