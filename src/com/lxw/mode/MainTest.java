package com.lxw.mode;

import org.junit.Test;

import com.lxw.mode.decorator.Man;
import com.lxw.mode.decorator.SuitDecorator;
import com.lxw.mode.decorator.TShirtsDecorator;
import com.lxw.mode.factory.Operation;
import com.lxw.mode.factory.OperationFactory;
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
}
