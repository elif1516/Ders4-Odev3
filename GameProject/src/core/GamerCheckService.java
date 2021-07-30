package core;

import java.rmi.RemoteException;

import entities.concretes.Gamer;

public interface GamerCheckService {
	boolean CheckIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException;

}
