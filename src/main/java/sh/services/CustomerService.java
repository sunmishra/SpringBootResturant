package sh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sh.entities.Customer;
import sh.entities.Menu;
import sh.repository.CustomerRepo;

@Service
public class  CustomerService {
	@Autowired
	CustomerRepo custRepo;
	
	public Customer findCustomer(Integer id) {
		return custRepo.findById(id).get();
	}
	
	public List<Customer> findCustomers() {
		return custRepo.findAll();
	}
	
//	public Customer findCustomerByEmail(String email) {
//		return custRepo.findByEmail(email);
//	}
	
	public void addCustomer(Customer cust) {
		Customer c = custRepo.save(cust);
	}

	public void delCustomerById(int id) {
		custRepo.deleteById(id);
	}

//	public Customer findCustomer(String email, String password) {
//		Customer cust = custRepo.findByEmail(email);
//		if(cust != null && cust.getPassword().equals(password))
//			return cust;
//		return null;
//	}
	
	public List<Customer> ListCustomer() {
		return custRepo.findAll();
	}
}