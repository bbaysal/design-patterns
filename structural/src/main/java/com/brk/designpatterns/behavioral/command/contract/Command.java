package com.brk.designpatterns.behavioral.command.contract;

public interface Command {
	void execute();
	void undo();
}
