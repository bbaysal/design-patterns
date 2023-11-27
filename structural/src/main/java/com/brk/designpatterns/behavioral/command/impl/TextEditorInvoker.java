package com.brk.designpatterns.behavioral.command.impl;

import com.brk.designpatterns.behavioral.command.contract.Command;

public class TextEditorInvoker {
	private Command command;

	TextEditorInvoker() {
	}

	TextEditorInvoker(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void setAndExecuteCommand(Command command) {
		this.command = command;
		command.execute();
	}

	public void executeCommand() {
		command.execute();
	}

	public void undoCommand() {
		command.undo();
	}
}
