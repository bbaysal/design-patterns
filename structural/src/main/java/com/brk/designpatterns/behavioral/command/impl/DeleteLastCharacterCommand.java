package com.brk.designpatterns.behavioral.command.impl;

import com.brk.designpatterns.behavioral.command.contract.Command;

public class DeleteLastCharacterCommand implements Command {

	private TextEditor editor;
	private String lastChar;

	public DeleteLastCharacterCommand(TextEditor editor) {
		this.editor = editor;
	}

	@Override
	public void execute() {
		lastChar = editor.deleteAndReturnLastCharacter();
	}

	@Override
	public void undo() {
		if(lastChar!=null) {
			editor.addText(lastChar);
		}
	}

}
