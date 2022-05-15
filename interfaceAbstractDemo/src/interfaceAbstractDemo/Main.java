package interfaceAbstractDemo;

import java.rmi.RemoteException;
import java.sql.Date;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.adaptors.MernisServiceAdaptor;
import interfaceAbstractDemo.concretes.NeroCustomerManager;
import interfaceAbstractDemo.concretes.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager=new NeroCustomerManager();
		BaseCustomerManager customerManager2=new StarbucksCustomerManager(new MernisServiceAdaptor());
		
		customerManager2.save(new Customer(1, "Yeþim", "Varlý", 1988, "11111111"));
	}

}
