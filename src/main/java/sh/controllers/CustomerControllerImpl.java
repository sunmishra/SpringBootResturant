package sh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sh.entities.Customer;
import sh.services.CustomerService;

@RestController
public class CustomerControllerImpl {

	@Autowired
	private CustomerService custService;


	@GetMapping("/getCustomers")
	public List<Customer> getItems() {
		List<Customer> custList = custService.findCustomers();
		return custList;
	}
	
	@GetMapping("/findCustomer/{id}")
	public Customer findCustomer(@PathVariable int id) {
		Customer c = custService.findCustomer(id);
		return c;
	}

	@PostMapping("/addCustomer")
	private int saveorUpdateCustomer(@RequestBody Customer cust) {
		custService.addCustomer(cust);
		return cust.getId();
	}
	
	@DeleteMapping("/removeCustomer/{id}")
	public void removeCustomer(@PathVariable int id) {
		custService.delCustomerById(id);
	}
	
}




