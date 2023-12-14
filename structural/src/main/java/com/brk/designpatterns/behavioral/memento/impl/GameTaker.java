package com.brk.designpatterns.behavioral.memento.impl;

import java.util.Stack;

public class GameTaker {

	private Stack<GameMemento> mementos = new Stack<GameMemento>();

	public void save(Game game) {
		mementos.push(game.save());
	}

	public void revert(Game game) {
		game.revert(mementos.pop());
	}

}
