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
		System.out.println(game.getId() +" Id numaras�na sahip oyun g�ncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() +" Oyunu sistemden kald�r�ld�.");
		
	}

}
