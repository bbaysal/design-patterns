package com.brk.designpatterns.behavioral.mediator.impl;

import java.util.ArrayList;
import java.util.List;

import com.brk.designpatterns.behavioral.mediator.contract.Component;
import com.brk.designpatterns.behavioral.mediator.contract.SmartHomeMediator;

// Concrete Mediator
public class SmartHomeHub implements SmartHomeMediator {
	private List<Component> components;

	public SmartHomeHub() {
		this.components = new ArrayList<Component>();
	}

	@Override
	public void notifyComponents(Component component, String event) {
		for (Component comp : components) {
			if (comp != component)
				comp.recieveNotification(event);
		}
	}

	@Override
	public void registerComponent(Component component) {
		this.components.add(component);
	}

}
