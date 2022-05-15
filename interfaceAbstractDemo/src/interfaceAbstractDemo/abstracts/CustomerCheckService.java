package interfaceAbstractDemo.abstracts;

import java.rmi.RemoteException;

import interfaceAbstractDemo.entities.Customer;

public interface CustomerCheckService {

	 Boolean checkIfRealPerson(Customer customer) throws Exception;
}
