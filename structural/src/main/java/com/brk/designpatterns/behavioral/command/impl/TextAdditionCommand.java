package com.brk.designpatterns.behavioral.command.impl;

import com.brk.designpatterns.behavioral.command.contract.Command;

public class TextAdditionCommand implements Command {

	private TextEditor editor;
	private String addedText;

	public TextAdditionCommand(TextEditor editor, String addedText) {
		this.editor = editor;
		this.addedText = addedText;
	}

	@Override
	public void execute() {
		editor.addText(addedText);
	}

	@Override
	public void undo() {
		if(editor.getText().endsWith(addedText)) {
			editor.deleteLastNCharacter(addedText.length());
		}
	}

}
