package com.brk.designpatterns.structural.proxy.impl;

import com.brk.designpatterns.structural.proxy.contract.RemoteService;

public class RemoteServiceImpl implements RemoteService {

	@Override
	public void performOperationWithoutAuth(String message) {
		System.out.println(message);
	}

	@Override
	public void performOperationWithAuth(String message) {
		System.out.println(message);
	}

}
