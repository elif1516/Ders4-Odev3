package business.concretes;

import business.abstracts.CampaignService;
import entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getName()+" kampanyası başarıyla eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getName()+" kampanyası başarıyla silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getName()+" kampanyası başarıyla güncellenmiştir.");
		
	}

}
