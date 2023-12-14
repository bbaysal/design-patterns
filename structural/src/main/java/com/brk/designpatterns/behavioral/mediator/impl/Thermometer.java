package com.brk.designpatterns.behavioral.mediator.impl;

import com.brk.designpatterns.behavioral.mediator.contract.Component;
import com.brk.designpatterns.behavioral.mediator.contract.SmartHomeMediator;

public class Thermometer extends Component {

	Thermometer(SmartHomeMediator mediator) {
		super(mediator);
	}

	@Override
	public void recieveNotification(String event) {
		System.out.println("Notification received by thermometer: " + event);
	}

	@Override
	public void performAction(String event) {
		System.out.println("Thermometer event: " + event);
		mediator.notifyComponents(this, event);
	}

}
