	package day4hw3;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.CustomerManager;
import Concretes.GameManager;
import Concretes.GameSaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,"Özcan","Kara","11111111111",LocalDate.of(1995,10,3));
		
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		customerManager.register(customer1);
		
		Game game1 = new Game(00212,"Red Dead Redemption 2 PC",315.0);
		Game game2 = new Game(00216,"Cyberpunk 2077 - GOG",221.2);
		Game game3 = new Game(00211,"Overwatch Standart Edition",122.4);
		
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.delete(game3);
		
	
		
		CampaignManager campaignManager = new CampaignManager();
		
		
		Campaign campaign1 = new Campaign(111,"Yýlýn Son Kampanyasý",10);
		
		campaignManager.addCampaign(campaign1);
		
		GameSaleManager gameSaleManager = new  GameSaleManager(campaign1);
		gameSaleManager.sale(game2, customer1);
		gameSaleManager.returnGame(game3, customer1);
		

	}

}
