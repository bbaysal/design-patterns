package com.brk.designpatterns.behavioral.mediator.impl;

import com.brk.designpatterns.behavioral.mediator.contract.Component;
import com.brk.designpatterns.behavioral.mediator.contract.SmartHomeMediator;

public class Light extends Component {

	protected Light(SmartHomeMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recieveNotification(String event) {
		System.out.println("Notification received by light: " + event);
	}

	@Override
	public void performAction(String event) {
		System.out.println("Light event: " + event);
		mediator.notifyComponents(this, event);
	}

}
