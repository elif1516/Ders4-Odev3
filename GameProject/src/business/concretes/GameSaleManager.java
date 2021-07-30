package business.concretes;

import business.abstracts.GameSaleService;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class GameSaleManager implements GameSaleService{

	@Override
	public void gameSale(Game game, Gamer gamer, Campaign campaign) {
		// TODO Auto-generated method stub
		double indirimliFiyat=game.getPrice()-(game.getPrice()*campaign.getDiscountPercentage()/100);
		System.out.println(game.getName()+" isimli oyun"+campaign.getName()+" kampanyasý dahilinde"+game.getPrice()+ "TL den yüzde"+
		campaign.getDiscountPercentage()+" indirimle"+ indirimliFiyat+" TL ye "+
				gamer.getFirstName()+" isimli oyuncuya satýlmýþtýr.");
		
	}

}
