package com.lxw.mode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 * @author lanxw
 * @date 2018年9月4日 上午11:16:20
 */
public class ProxyImage implements InvocationHandler{

	
	private Object targetObject;
	
	public ProxyImage(Object targetObject) {
		this.targetObject = targetObject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before proxy instanceof");
		
		method.invoke(targetObject, args);
		
		System.out.println("after proxy instanceof");
		return null;
	}

}
