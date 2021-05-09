package interfaceAbstractDemo2;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entity.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Özcan") ;
		customer1.setLastName("Kara");
		customer1.setDateOfBirth(LocalDate.of(1995,10,3));
		customer1.setNationalityId("11111111111");
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(customer1);
		
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setFirstName("Özcan") ;
		customer2.setLastName("Kara");
		customer2.setDateOfBirth(LocalDate.of(1995,10,10));
		customer2.setNationalityId("11111111111");
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(customer2);
	}

}
