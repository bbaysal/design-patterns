package com.brk.designpatterns.behavioral.mediator.impl;

import com.brk.designpatterns.behavioral.mediator.contract.Component;
import com.brk.designpatterns.behavioral.mediator.contract.SmartHomeMediator;

public class Television extends Component {

	protected Television(SmartHomeMediator mediator) {
		super(mediator);
	}

	@Override
	public void recieveNotification(String event) {
		System.out.println("Notification received by television: " + event);
	}

	@Override
	public void performAction(String event) {
		System.out.println("Television event: " + event);
		mediator.notifyComponents(this, event);
	}

}
