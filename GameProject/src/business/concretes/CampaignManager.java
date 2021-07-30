package business.concretes;

import business.abstracts.CampaignService;
import entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getName()+" kampanyas� ba�ar�yla eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getName()+" kampanyas� ba�ar�yla silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getName()+" kampanyas� ba�ar�yla g�ncellenmi�tir.");
		
	}

}
