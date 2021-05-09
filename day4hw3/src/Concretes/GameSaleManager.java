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
		+ " kullan�c�m�za " + campaign.getName() + " kampanyas�yla sat�ld�.");
		
	}


	@Override
	public void returnGame(Game game, Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() 
		+ " kullan�c�m�z " + game.getName() + " adl� oyunu iade etti.");
		
	}

}
