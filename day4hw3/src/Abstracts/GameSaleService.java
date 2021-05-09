package Abstracts;

import Entities.Customer;
import Entities.Game;

public interface GameSaleService {
	void sale(Game game,Customer customer);
	void returnGame(Game game, Customer customer);
}
