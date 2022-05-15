package interfaceAbstractDemo.concretes;

import java.rmi.RemoteException;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
		public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

		@Override
		public void save(Customer customer) throws Exception{
			if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
			}else {
				throw new Exception("Kiþi doðrulanamadý.");
				//System.out.println("Kiþi doðrulanamadý.");
			
			}
			
		
		}

	

	


}
