package Abstracts;

import Entities.Customer;

public abstract class BaseCustomerService implements CustomerService{

	@Override
	public void register(Customer customer) {
		System.out.println(customer.getFirstName() + " isimli kullan�c� sisteme kaydoldu");
		
	}

	@Override
	public void update(Customer customer) {
	
		
	}

	@Override
	public void delete(Customer customer) {
	
		
	}

	
}
