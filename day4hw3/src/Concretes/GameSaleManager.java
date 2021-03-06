package Concretes;

import Abstracts.GameSaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameSaleManager implements GameSaleService{

	private Campaign campaign;
	
	
	public GameSaleManager(Campaign campaign) {
		this.campaign = campaign;
	}


	@Override
	public void sale(Game game, Customer customer) {
		System.out.println(game.getName() + " " + customer.getFirstName() + " " + customer.getLastName() 
		+ " kullanıcımıza " + campaign.getName() + " kampanyasıyla satıldı.");
		
	}


	@Override
	public void returnGame(Game game, Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() 
		+ " kullanıcımız " + game.getName() + " adlı oyunu iade etti.");
		
	}

}
