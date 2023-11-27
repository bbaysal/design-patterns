package com.brk.designpatterns.behavioral.command.impl;

public class TextEditor {
	private StringBuilder builder;

	public TextEditor() {
		this.builder = new StringBuilder();
	}

	public void addText(String text) {
		if (text != null) {
			builder.append(text);
		}
	}

	public String getText() {
		return builder.toString();
	}

	public String deleteAndReturnLastCharacter() {
		if (builder.length() > 0) {
			String lastCharacter = builder.substring(builder.length() - 1);
			builder.deleteCharAt(builder.length() - 1);
			return lastCharacter;
		} else {
			return null;
		}
	}

	public void deleteLastCharacter() {
		if (builder.length() > 0) {
			builder.deleteCharAt(builder.length() - 1);
		}
	}

	public void deleteLastNCharacter(int length) {
		if (builder.length() > length) {
			builder.delete(builder.length() - length, builder.length());
		}
	}
}
