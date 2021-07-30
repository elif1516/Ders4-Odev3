import java.rmi.RemoteException;

import business.concretes.GameSaleManager;
import business.concretes.GamerManager;
import core.GamerCheckAdaptor;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		//int id, String nationalityId, int birthOfYear, String firstName, String lastName, String mail)
		Gamer gamer=new Gamer(1,"31331339736",1986,"ELÝF","KOÇAK","elif@mail.com");
		GamerManager gamerManager=new GamerManager(new GamerCheckAdaptor());
		gamerManager.add(gamer);
		// (int id, String name, double price
		Game game=new Game(1,"Ben10",150);
		// int id, String name, int discountPercentage)
		Campaign campaign=new Campaign(1,"Yaz Tatili Hediyesi",25);
		
		GameSaleManager satis1=new GameSaleManager();
		satis1.gameSale(game, gamer, campaign);

	}

}
