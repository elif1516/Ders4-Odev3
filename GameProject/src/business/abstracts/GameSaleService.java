package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public interface GameSaleService {
	void gameSale(Game game, Gamer gamer, Campaign campaign);

}
