package Abstracts;

import Entities.Customer;

public interface CustomerService {
	
	void register (Customer customer);
	void update (Customer customer);
	void delete (Customer customer);
	

}
