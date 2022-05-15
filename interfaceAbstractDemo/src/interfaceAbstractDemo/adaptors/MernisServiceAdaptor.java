package interfaceAbstractDemo.adaptors;

import java.rmi.RemoteException;

import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements CustomerCheckService {

	@Override
	public Boolean checkIfRealPerson(Customer customer) throws Exception {
		KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		Boolean result= kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirthYear());
		return result;
	}

}
