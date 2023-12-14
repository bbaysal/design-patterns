package com.brk.designpatterns.behavioral.memento.impl;

import com.brk.designpatterns.behavioral.contract.BehavioralPattern;

public class MementoPatternImpl implements BehavioralPattern {

	@Override
	public void apply() {
		Game game = new Game();
		GameTaker gameTaker = new GameTaker();
		game.increaseLevel();
		game.addScore(10);
		game.acquireItem("Stone");
		System.out.println(game.toString());
		gameTaker.save(game);
		game.acquireItem("Weapon");
		System.out.println(game.toString());
		gameTaker.save(game);
		game.increaseLevel();
		game.addScore(20);
		game.acquireItem("Shield");
		gameTaker.save(game);
		System.out.println(game.toString());
		gameTaker.revert(game);
		gameTaker.revert(game);
		System.out.println(game.toString());
		gameTaker.revert(game);
		System.out.println(game.toString());
	}

	@Override
	public String getName() {
		return "Memento Pattern";
	}

}
