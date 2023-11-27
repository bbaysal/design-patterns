package com.brk.designpatterns.behavioral.command.impl;

import com.brk.designpatterns.behavioral.contract.BehavioralPattern;

public class CommandPatternImpl implements BehavioralPattern {

	@Override
	public void apply() {
		TextEditor editor1 = new TextEditor();
		TextAdditionCommand additionCommand = new TextAdditionCommand(editor1, "Sample Text");
		TextAdditionCommand additionCommand2 = new TextAdditionCommand(editor1, "Undo Text");
		DeleteLastCharacterCommand deleteLastCharacterCommand = new DeleteLastCharacterCommand(editor1);

		TextEditorInvoker invoker = new TextEditorInvoker();
		invoker.setAndExecuteCommand(additionCommand);
		System.out.println("Editor Text(Add Command): " + editor1.getText());
		invoker.setAndExecuteCommand(additionCommand2);
		System.out.println("Editor Text(Add Command): " + editor1.getText());
		invoker.undoCommand();
		System.out.println("Editor Text(Undo Command):" + editor1.getText());
		invoker.setAndExecuteCommand(deleteLastCharacterCommand);
		System.out.println("Editor Text(Delete Command): " + editor1.getText());
	}

	@Override
	public String getName() {
		return "Command";
	}

}
