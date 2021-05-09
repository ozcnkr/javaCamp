package Concrete;

import Abstract.BaseCustomerManager;
import Entity.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void save(Customer customer) throws Exception {
		
		super.save(customer);
	}

}
