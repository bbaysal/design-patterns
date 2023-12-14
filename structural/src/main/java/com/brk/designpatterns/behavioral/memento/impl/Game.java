package com.brk.designpatterns.behavioral.memento.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Originator: Represent the state of the class
public class Game {
	private int level;
	private int score;
	private List<String> items;

	Game() {
		this.level = 0;
		this.score = 0;
		this.items = new ArrayList<String>();
	}

	public void increaseLevel() {
		this.level++;
	}

	public void addScore(int score) {
		this.score += score;
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

	public void acquireItem(String item) {
		this.items.add(item);
	}

	public String toString() {
		return "Game State: Level: " + level + " - Score: " + score + " - Items: "
				+ items.stream().collect(Collectors.joining(" | "));
	}

	// Save the current state
	public GameMemento save() {
		ArrayList<String> mementoItems = new ArrayList<String>(items);
		return new GameMemento(level, score, mementoItems);
	}

	// Restores states from the memento
	public void revert(GameMemento gameMemento) {
		this.level = gameMemento.getLevel();
		this.items = gameMemento.getItems();
		this.score = gameMemento.getScore();
	}
}
