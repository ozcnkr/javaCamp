package Concretes;

import Abstracts.BaseCustomerService;
import Abstracts.CustomerCheckService;
import Abstracts.CustomerService;
import Entities.Customer;

public class CustomerManager extends BaseCustomerService{

	private CustomerCheckService customerCheckService;
	
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void register(Customer customer) {
		CheckIfRealPerson(customer);
	}

	private void CheckIfRealPerson(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer))
		{
			super.register(customer);
		}
		
	}

	@Override
	public void update(Customer customer) {
	
	}

	@Override
	public void delete(Customer customer) {
	
	}

}
