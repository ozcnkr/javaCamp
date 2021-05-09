package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		CheckIfRealPerson(customer);
	}

	private void CheckIfRealPerson(Customer customer) throws Exception {
		if(customerCheckService.CheckIfRealPerson(customer))
		{
			super.save(customer);
		}else
			
		{
			System.out.println("Gerçek kiþi deðil");
		}
		
		
	}

}
