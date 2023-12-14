package com.brk.designpatterns.behavioral.mediator.contract;

public abstract class Component {
	protected SmartHomeMediator mediator;

	protected Component(SmartHomeMediator mediator) {
		this.mediator = mediator;
	}

	public abstract void recieveNotification(String event);

	public abstract void performAction(String event);
}
