package Concretes;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " Oyunu sisteme eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getId() +" Id numarasýna sahip oyun güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() +" Oyunu sistemden kaldýrýldý.");
		
	}

}
