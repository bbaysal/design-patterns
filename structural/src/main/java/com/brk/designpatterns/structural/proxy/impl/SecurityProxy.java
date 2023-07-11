package com.brk.designpatterns.structural.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {

	private Object obj;

	private SecurityProxy(Object obj) {
		this.obj = obj;
	}

	public static Object newInstance(Object obj) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
				new SecurityProxy(obj));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;
		try {
			if (method.getName().contains("WithAuth")) {
				// You can do any authentication scheme in this block.
				// Security proxy comes into play in there.
				throw new IllegalAccessError("Authentication Error. Cannot perform operation without authentication.");
			}
			result = method.invoke(obj, args);
			return result;
		} catch (InvocationTargetException ex) {
			throw ex.getTargetException();
		} catch (Exception ex) {
			throw new RuntimeException("unexpected invocation: " + ex.getMessage());
		}
	}
}
