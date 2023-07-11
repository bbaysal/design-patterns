package com.brk.designpatterns.structural.proxy.contract;

public interface RemoteService {
		void performOperationWithoutAuth(String message);
		void performOperationWithAuth(String message);
}
