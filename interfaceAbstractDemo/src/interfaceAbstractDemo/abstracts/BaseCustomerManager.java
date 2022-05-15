package interfaceAbstractDemo.abstracts;

import java.rmi.RemoteException;

import interfaceAbstractDemo.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Veritabanýna kaydedildi: "+customer.getFirstName());
	}

}
