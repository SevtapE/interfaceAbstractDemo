package interfaceAbstractDemo.concretes;

import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public Boolean checkIfRealPerson(Customer customer) {
		//do�rulanm�� varsay�yorum.

		return true;
		
	}

}
