package com.brk.designpatterns.behavioral.mediator.impl;

import com.brk.designpatterns.behavioral.contract.BehavioralPattern;
import com.brk.designpatterns.behavioral.mediator.contract.SmartHomeMediator;

public class MediatorPaternImpl implements BehavioralPattern {

	@Override
	public void apply() {
		SmartHomeMediator mediator = new SmartHomeHub();

		Light light = new Light(mediator);
		Television television = new Television(mediator);
		Thermometer thermometer = new Thermometer(mediator);

		mediator.registerComponent(thermometer);
		mediator.registerComponent(television);
		mediator.registerComponent(light);

		light.performAction("Open Lights");
		television.performAction("Shut down television");
		thermometer.performAction("Set temperature to 20C");
	}

	@Override
	public String getName() {
		return "Mediator Pattern";
	}

}
