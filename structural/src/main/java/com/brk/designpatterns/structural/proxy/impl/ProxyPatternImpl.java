package com.brk.designpatterns.structural.proxy.impl;

import com.brk.designpatterns.structural.contract.StructralPattern;
import com.brk.designpatterns.structural.proxy.contract.RemoteService;

public class ProxyPatternImpl implements StructralPattern {

	@Override
	public void apply() {
		RemoteService remoteService = (RemoteService) SecurityProxy.newInstance(new RemoteServiceImpl());
		remoteService.performOperationWithoutAuth("Performing operation without authentication");
		remoteService.performOperationWithAuth("Performing operation with authentication");
	}

	@Override
	public String getName() {
		return "Proxy Pattern";
	}

}
