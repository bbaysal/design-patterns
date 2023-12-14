package com.brk.designpatterns.behavioral.mediator.contract;


// Mediator Interface
public interface SmartHomeMediator {

	void notifyComponents(Component component, String event);
	void registerComponent(Component component);
}
