package business.concretes;

import java.rmi.RemoteException;

import business.abstracts.GamerService;
import core.GamerCheckService;
import entities.concretes.Gamer;

public class GamerManager implements GamerService{
	
	GamerCheckService check;
	public GamerManager (GamerCheckService gamerCheckService)
	{
		this.check=gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		if(check.CheckIfRealPerson(gamer))
		{
		   System.out.println(gamer.getFirstName()+" oyuncu başarıyla eklenmiştir.");
		}
		else 
		{
			System.out.println(gamer.getFirstName()+" oyuncu bilgileri hatalıdır, kaydınız yapılamamıştır.");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getFirstName()+" kaydınız silinmiştir.");
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getFirstName()+" kaydınız başarıyla güncellenmiştir.");
		
	}

}
