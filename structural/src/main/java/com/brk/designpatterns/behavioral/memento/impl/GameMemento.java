package com.brk.designpatterns.behavioral.memento.impl;

import java.util.List;

public class GameMemento {
	private int level;
	private int score;
	private List<String> items;
	
	public GameMemento(int level, int score, List<String> items) {
		super();
		this.level = level;
		this.score = score;
		this.items = items;
	}

	public List<String> getItems() {
		return items;
	}

	public int getLevel() {
		return level;
	}

	public int getScore() {
		return score;
	}
	

}
