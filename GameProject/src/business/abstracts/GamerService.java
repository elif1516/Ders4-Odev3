package business.abstracts;

import java.rmi.RemoteException;

import entities.concretes.Gamer;

public interface GamerService {
	 void add(Gamer gamer) throws NumberFormatException, RemoteException;
	 void delete (Gamer gamer);
	 void update(Gamer gamer);

}
