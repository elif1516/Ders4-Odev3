package core;

import java.rmi.RemoteException;

import entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class GamerCheckAdaptor implements GamerCheckService{
	
	KPSPublicSoapProxy kps=new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
		boolean isRealPerson=kps.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getBirthOfYear());
		if(isRealPerson)
		{ return true;}
		else 
		{ return false;}
	}

}
