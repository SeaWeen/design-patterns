package com.lxw.mode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

import com.lxw.mode.decorator.Man;
import com.lxw.mode.decorator.SuitDecorator;
import com.lxw.mode.decorator.TShirtsDecorator;
import com.lxw.mode.factory.Operation;
import com.lxw.mode.factory.OperationFactory;
import com.lxw.mode.proxy.Image;
import com.lxw.mode.proxy.ProxyImage;
import com.lxw.mode.proxy.RealImage;
import com.lxw.mode.strategy.CashContext;

public class MainTest {

	@Test
	public void factoryTest() {
		Operation operation = OperationFactory.createOperation("/");
		double result = operation.getResult(9, 4);
		System.out.println(result);
	}

	@Test
	public void strategyTest() {
		String type = "满300返100";
		CashContext context = new CashContext(type);
		double result = context.getResult(349.34);
		System.out.println("实际收费金额："+result);
	}
	
	@Test
	public void decoratorTest() {
		Man concreteComponent = new Man();
		SuitDecorator suit = new SuitDecorator();
		TShirtsDecorator tshirt = new TShirtsDecorator();
		suit.setComponent(concreteComponent);
		tshirt.setComponent(suit);
		tshirt.show();
		
	}
	
	@Test
	public void proxyTest() {
		Image image = new RealImage();
		InvocationHandler handler = new ProxyImage(image); 
		Image proxyImage = (Image) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
				image.getClass().getInterfaces(), handler);
		//String name = proxyClass.getName();
		proxyImage.display();
	}
	
	@Test
	public void utilTest() {
		Method[] methods = Image.class.getMethods();
		for (int i = 0; i < methods.length; i++) {
			
			System.out.println(methods[i].getName());
		}
	}
}
